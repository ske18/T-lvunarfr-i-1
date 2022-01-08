/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class HalloTolur {
    public static void main(String[] args) {
        int a, b;
        a = 1234;
        b = 99;
        System.out.println("a er " + a + " og b er " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("a er " + a + " og b er " + b);
    }
}
