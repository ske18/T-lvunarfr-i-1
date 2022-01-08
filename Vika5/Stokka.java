/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Stokka {
    public static void main(String[] args) {
        int N = args.length;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < N; i++) {
            // finnum fyrst slembitölu
            int j = StdRandom.uniform(i, N);
            // Víxla á staki í fylkinu nr i og j
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
