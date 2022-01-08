import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Reiknar út landstölur úr alþingiskosningum með því að fá inn
 *  *  fjölda atkvæða flokka í framboði og fjölda kjördæmakjörinna þingmanna
 *  *  9 landstölur eru reiknaðar fyrir hvern flokk þar sem fyrsta talan er fjöldi
 *  *  kjördæmakjörinna þingmanna + 1, önnur talan er fjöldi
 *  *  *  kjördæmakjörinna þingmanna + 2 o.s.frv.
 *
 *
 *
 ****************************************************/

public class Kosningar {


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
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int fjoldiFlokka = s.nextInt();
        int[] atkvaedi = new int[fjoldiFlokka];
        int[] thingmenn = new int[fjoldiFlokka];
        for (int i = 0; i < fjoldiFlokka; i++) {
            atkvaedi[i] = s.nextInt();
            thingmenn[i] = s.nextInt();
        }
        double landstolur[][] = landstolur(atkvaedi, thingmenn);
        prenta(fjoldiFlokka, landstolur);
    }


    private static void prenta(int fjoldiFlokka, double[][] landstolur) {
        for (int i = 0; i < landstolur.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < fjoldiFlokka; j++) {
                System.out.printf("%.1f ", landstolur[i][j]);
            }
            System.out.println();
        }
    }
}
