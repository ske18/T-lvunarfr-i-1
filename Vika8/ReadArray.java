import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið býr til tvö föll, heiltölufylki
 *          þar sem annað er einvítt og hitt tvívítt,
 *          sem lesin eru af staðalinntaki.
 *
 *
 *
 ****************************************************/

public class ReadArray {
    private static Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

    /**
     * Les inn einvítt fylki af staðalinntaki. Fyrst er víddin lesin og síðan
     * jafnmörg stök og víddin segir til um
     *
     * @return skilar fylkinu
     * @throws NoSuchElementException - ef ekki nógu mörg stök eru í staðalinntaki
     *                                eða þau eru ekki af kommutölutagi
     */
    public static double[] read1DdoubleArray() throws NoSuchElementException {
        int n = s.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = s.nextDouble();
        return a;
    }

    /**
     * Fallið les inn af staðalinntaki einvítt heiltölufylki og skilar því
     *
     * @return fylkið a þar sem fyrst er lesin inn víddin n og svo n stök.
     * @throws NoSuchElementException -
     */
    public static int[] read1DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }

    /**
     * Fallið les inn af staðalinntaki tvívítt heiltölufylki og skilar því
     *
     * @return heiltölufylkið a þar sem fyrst eru lesnar inn víddirnar n og m, svo n*m stök.
     * @throws NoSuchElementException-
     */
    public static int[][] read2DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        return a;
    }

    public static void main(String[] args) {
        /* ekki rétt prófun svo..
        int[] test1 = read1DintArray();
        System.out.println(Arrays.toString(test1));

        int[][] test2 = read2DintArray();
        System.out.println(Arrays.deepToString(test2));

         */
        try {
            int[] m = read1DintArray();
            System.out.println(Arrays.toString(m));
            int[][] m2 = read2DintArray();
            System.out.println(Arrays.deepToString(m2));
        } catch (
                NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
