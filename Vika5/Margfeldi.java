/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið les inn þrjú eða fleiri heiltölu-
 *          gildi af skipanalínu og margfaldar saman
 *          stökin.
 *
 ****************************************************/

public class Margfeldi {
    public static void main(String[] args) {
        int N = args.length;
        int[] tala = new int[N];
        int[] margf = new int[N];

        for (int i = 0; i < N; i++) {
            tala[i] = Integer.parseInt(args[i]);
        }
        for (int i = 2; i < N + 2; i++) {
            margf[i % N] = tala[(i - 1) % N] * tala[(i - 2) % N];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(margf[i] + " ");
        }
    }
}
