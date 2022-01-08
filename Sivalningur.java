/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið fær inn á skipanalínu kommutölur og
 *          skrifar út flatarmál og rúmmál.
 *
 *
 ****************************************************/

public class Sivalningur {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        System.out.print("Flatarmál sívalnings með radíus " + r + " og hæð " + h + " er: ");
        System.out.println(Math.PI * 2 * r * (r + h));
        System.out.print("Rúmmál sívalnings með radíus " + r + " og hæð " + h + " er: ");
        System.out.println(Math.PI * r * r * h);
    }
}
