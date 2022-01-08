/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn inniheldur fall sem tekur inn tvö
 *          heiltölufylki og býr til nýtt heiltölu-
 *          fylki úr samtölum fyrri stakanna tveggja.
 *
 ****************************************************/

public class Fylki {
    public static int[] samtalaFylki(int[] a, int[] b) {
        int[] c = new int[a.length];    // býr til nýtt fylki af sömu lengd og a
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];        // samtala af a og b - stakvís
        }
        return c;
    }

    //prófunaraktygi fyrir samtalaFylki
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 70, 100, 1000};
        int[] b = {30, 40, 60, 70, 80, 19, 99, 100};

        int[] c = samtalaFylki(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(c[i] + ", ");
        }
    }
}
