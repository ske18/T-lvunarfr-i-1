import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið finnur 9 jöfnunarsæti þingflokka út
 *          frá landstölum með því að finna hvaða flokkur
 *          er með þá hæstu.
 *          Ýmis föll til að útreikna niðurstöðu kosninga - frá Ebbu
 *
 ****************************************************/

public class Kosningar {

    /**
     * Finnur jöfnunarsæti þingflokka út frá landstölum með því að finna þann flokk
     * sem er með hæstu landstöluna, finna síðan þann flokk sem er með næst hæstu landstöluna,
     * og þannig koll af kolli þar til 9 jöfnunarsæti hafa verið fundin
     *
     * @param landstolur tvívítt fylki (9xfjöldi flokka) með 9 landstölum flokka hvern flokk
     * @param flokkar    listabókstafir flokka
     * @return fylki af listabókstöfum jöfnunarþingsæta
     */
    public static String[] flokkarJofnun(double[][] landstolur, String[] flokkar) {
        final int FJJOFNUN = 9; // Fjöldi jöfnufnarþingsæta
        final int EFST = 0;   // efsta línan í landstölufylkinu
        // betra að taka afrit svo við þurfum ekki að breyta inntaksfylkinu
        // má líka skrifa aðferð sem afritar stakvís landstolur yfir í l
        double[][] l = Arrays.stream(landstolur) // streyma línunum
                .map(a -> Arrays   // fyrir hverja línu búa til afrit
                        .copyOf(a, a.length)) //
                .toArray(double[][]::new); // setja í nýtt tvívítt fylki
        String[] jofnunarsaeti = new String[FJJOFNUN];
        for (int i = 0; i < FJJOFNUN; i++) {
            int j = maxFlokkur(l[EFST]);
            jofnunarsaeti[i] = flokkar[j];
            upp(l, j);
        }
        return jofnunarsaeti;
    }

    /**
     * Gerir shift upp um einn á j-ta dálki í fylkinu l
     *
     * @param l tvívítt fylki l
     * @param j dálkurinn sem á að shift-a upp um einn
     */
    private static void upp(double[][] l, int j) {
        double f = l[0][j];
        for (int i = 0; i < l.length - 1; i++) {
            l[i][j] = l[(i + 1) % l.length][j];
        }
        l[l.length - 1][j] = f;
    }

    /**
     * Finnur sæti þess staks sem hefur hæsta gildið
     *
     * @param fylki fylki sem á að finna hæsta gildið í
     * @return sæti þess staks sem hefur hæsta gildið í { @code fylki}
     */
    private static int maxFlokkur(double[] fylki) {
        int max = 0;
        for (int i = 0; i < fylki.length; i++) {
            if (fylki[i] > fylki[max]) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Reiknar út landstölur alþingiskosninga út frá atkvæðafjölda og fjölda kjördæmakjörinna
     * þingmanna
     *
     * @param atkvaedi  fjöldi atkvæða
     * @param thingmenn fjöldi kjördæmakjörinna þingmana
     * @return fylki af landstölum fyrir hvern flokk í framboði
     */
    public static double[][] landstolur(int[] atkvaedi, int[] thingmenn) {
        final int FJSAETA = 9;
        double[][] landstolur = new double[FJSAETA][atkvaedi.length];
        for (int i = 0; i < FJSAETA; i++) {
            for (int j = 0; j < atkvaedi.length; j++) {
                landstolur[i][j] = (double) atkvaedi[j] / (thingmenn[j] + i + 1);
            }
        }
        return landstolur;
    }

    public static void main(String[] args) {
        StdRandom.setSeed(22);
        String[] allirFlokkar = {"B", "C", "D", "F", "M", "P", "S", "V"};
        int fjFlokka = StdRandom.uniform(1, 5);
        System.out.println("fjöldi flokka " + fjFlokka);
        String[] testFlokkar = Arrays.copyOf(allirFlokkar, fjFlokka);
        System.out.println(Arrays.toString(testFlokkar));
        int[] a = new int[fjFlokka];   // atkvæði
        int[] t = new int[fjFlokka];   // fjöldi þingmanna

        double[][] landstolur = framleidaTilvik(a,
                t);
        System.out.println(Arrays.deepToString(landstolur));
        System.out.println(Arrays.toString(testFlokkar));
        String[] jofnunarsaeti = flokkarJofnun(landstolur, testFlokkar);
        System.out.println(Arrays.toString(jofnunarsaeti));
    }

    /**
     * Býr til slembitölur sem hægt er að nota til að prófa og skilar landstölum
     *
     * @param a fjöldi atkvæða
     * @param t fjölda þingmanna
     * @return skilar landstölum
     */
    private static double[][] framleidaTilvik(int[] a, int[] t) {
        framleidaAtkvaedi(a);
        framleidaThingmenn(t);
        double[][] expected = landstolur(a, t); // vænt gildi
        return expected;
    }

    /**
     * Býr til slembitölu fjölda atkvæða
     *
     * @param a fjöldi atkvæða stjórnmálaflokka
     */
    private static void framleidaAtkvaedi(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(1, 70000);
        }
    }

    /**
     * Býr til slembitölu fjölda kjördæmakjörinna þingmanna
     *
     * @param a fjöldi kjördæmakjörinna þingmanna
     */
    private static void framleidaThingmenn(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(1, 63);
        }
    }

}
