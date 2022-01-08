import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið birtir súlurit með falli sem finnur
 *          tíðni heiltalna og skilar í kommufylki.
 *          Annað fall teiknar súluritið með fylkinu.
 *
 ****************************************************/

public class Sulurit {

    /**
     * Fall sem reiknar ýt tíðni fyrir súlurit.
     *
     * @param fylki heiltölufylki sem finnur tíðni talnanna og skilar í kommutölufylki
     * @return fylkið nyttFylki sem hefur tölur frá 0 upp í stærstu tölu fylkisins plús 1
     */
    public static double[] tidni(int[] fylki) {
        int n = fylki.length;
        int max = fylki[0];
        for (int i = 0; i < n; i++) {
            if (fylki[i] > max) max = fylki[i];
        }
        double[] nyttFylki = new double[max];
        for (int j = 0; j < n; j++) {
            int k = fylki[j];
            nyttFylki[k - 1]++;
        }
        return nyttFylki;
    }

    /**
     * Fall sem teiknar súlurit rangt hjá mér, Ebbu lausn fyrir neðan
     *
     * @param fylki notar StdDraw til að teikna súluritið sjálft með gögnum fylkisins.

    public static void birta(double[] fylki) {
    int n = fylki.length;
    StdDraw.setYscale(0, n);
    StdStats.plotBars(fylki);
    } */
    /**
     * Birtir í grafísku viðmóti súlurit þar sem hæð súlnanna er í fylki. Skalinn á y ásnum er einum
     * stærri en
     * stærsta talan í fylki
     *
     * @param fylki hæð súlnanna
     */
    public static void birta(double[] fylki) {
        StdDraw.setYscale(0, StdStats.max(fylki) + 1);
        StdStats.plotBars(fylki);
    }

    public static void main(String[] args) {
        int[] f = {3, 6, 1, 5, 1, 6, 1, 1, 6, 3};
        System.out.println(Arrays.toString(tidni(f)));
        birta(tidni(f));
    }
}
