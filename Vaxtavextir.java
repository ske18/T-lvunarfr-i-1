/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn tekur inn af skipanalínu tvær kommu-
 *          tölur og eina heiltölu og reiknar út vaxta-
 *          greiðslu.
 *
 ****************************************************/

public class Vaxtavextir {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);

        System.out.print("Vaxtagreiðslan er:");
        System.out.println(P * (Math.pow(1 + i / 100, n) - 1));

    }
}
