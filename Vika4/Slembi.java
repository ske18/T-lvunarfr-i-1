/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Slembi {
    public static void main(String[] args) {
        double x = StdRandom.uniform(0.0, 1.0);
        while (x <= 0.8) {
            System.out.println(x);
            x = StdRandom.uniform(0.0, 1.0);
        }
    }
}
