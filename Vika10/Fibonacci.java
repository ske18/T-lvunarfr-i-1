/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið kallar á endurkvæma fallið f sem býr
 *          til Fibonacci orð.
 *
 *
 ****************************************************/

public class Fibonacci {
    /**
     * Fallið f býr til Fibonacci orð með tveimur bókstöfum og einni heiltölu.
     *
     * @param a bókstafur
     * @param b bókstafur
     * @param n heiltala
     * @return Fibonacci orð
     */
    public static String f(char a, char b, int n) {
        if (n == 0)
            return "" + a;
        if (n == 1)
            return "" + b;

        return f(a, b, n - 1) + f(a, b, n - 2);
    }

    public static void main(String[] args) {
        int prufa5 = 5;
        System.out.println(f('a', 'b', prufa5));
        int prufa6 = 6;
        System.out.println(f('a', 'b', prufa6));
        int prufa7 = 7;
        System.out.println(f('a', 'b', prufa7));
    }
}
