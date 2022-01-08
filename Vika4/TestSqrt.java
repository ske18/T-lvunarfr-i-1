/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : ctrl+q sýnir lýsingu á dæmum
 *
 *
 *
 ****************************************************/

public class TestSqrt {
    public static void main(String[] args) {
        try {
            double num = Double.parseDouble(args[0]);
            if (num >= 0.0)
                System.out.println("Sqrt is " + Math.sqrt(num));
        } catch (NumberFormatException e) {
            System.out.println("Inntak verður að vera kommutala");
        }
    }
}
