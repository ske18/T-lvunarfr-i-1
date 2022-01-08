/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Finnur kvaðratrót af inntaki c sem er
 * kommutala og prentar út. Finna fjölda ítrana og til
 * að nógu góða nákvæmni.
 *
 ****************************************************/

public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double t = c; // c er nýja gildið í upphafi
        double EPSILON = 1.0e-15;
        int count = 0;
        while (Math.abs(t - c / t) > EPSILON * t) { // á meðan munurinn á gildunum er stærri en einhver nákvæmni
            t = (t + c / t) / 2.0;
            count++; // sama og count = count +1
        }
        System.out.println("Ítranir " + count);
        System.out.println(t);
    }
}
