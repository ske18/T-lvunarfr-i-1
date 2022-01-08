/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið finnur og prentar út lengd dals í
 *          röð heiltalna og að það sé í mesta lagi einn
 *          dalur í röð heiltalna. Gildi fyrir og eftir
 *          runu er stærri en talan í rununni.Lengd dals
 *          er alltaf stærri en 1.
 ****************************************************/

public class Dalur {
    public static void main(String[] args) {
        int N = args.length;
        int[] lengd = new int[N];

        for (int i = 0; i < N; i++) {
            lengd[i] = Integer.parseInt(args[i]);
        }
        boolean erDalur = false;
        int dalur = 0;
        for (int i = 1; i < N; i++) {
            if (lengd[i] < lengd[i - 1]) {
                dalur = 1;
            } else if (lengd[i] > lengd[i - 1] && dalur > 1) {
                erDalur = true;
                break;
            } else if (lengd[i] == lengd[i - 1] && dalur > 0) {
                dalur++;
            } else dalur = 0;
        }
        int utkoma = erDalur ? dalur : 0;
        System.out.println("Lengd dals er " + utkoma);
    }
}


