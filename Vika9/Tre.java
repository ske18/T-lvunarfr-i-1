import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið tekur inn tvívítt heiltölufylki sem
 *          myndar tré sem er grænt með gulum ljósum.
 *
 *
 ****************************************************/

public class Tre {
    /**
     * Fallið tre býr til tvívítt heiltölufylki.
     *
     * @param n heiltalan í tre.
     * @param p kommutalan í tre.
     * @return - tvívítt heiltölufylki.
     */
    public static int[][] tre(int n, double p) {
        int[][] jolatre = new int[n][n * 2 - 1];
        final int GRAENN = 5;
        final int GULUR = 1;
        for (int i = 0; i < jolatre.length; i++) {
            for (int j = n - 1 - i; j <= n - 1 + i; j++) {
                if (StdRandom.bernoulli(p)) jolatre[i][j] = GULUR;
                else jolatre[i][j] = GRAENN;
            }
        }
        return jolatre;
    }


    public static void main(String[] args) {
        System.out.println("Tré 5: ");
        int[][] tre5 = tre(5, 0.1);
        for (int i = 0; i < tre5.length; i++) {
            System.out.println(Arrays.deepToString(tre5));
        }
        System.out.println("Tré 4: ");
        int[][] tre4 = tre(4, 0.8);
        for (int i = 0; i < tre5.length; i++) {
            System.out.println(Arrays.deepToString(tre4));
        }
        System.out.println("Tré 3: ");
        int[][] tre3 = tre(3, 0.3);
        for (int i = 0; i < tre5.length; i++) {
            System.out.println(Arrays.deepToString(tre3));
        }
        System.out.println("Tré 2: ");
        int[][] tre2 = tre(2, 0.5);
        for (int i = 0; i < tre2.length; i++) {
            System.out.println(Arrays.deepToString(tre2));
        }
    }
}
