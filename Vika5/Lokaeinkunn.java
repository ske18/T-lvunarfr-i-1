/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :  Forritið tekur inn 4 tölur af skipanalínu
 *           þar sem hver tala er á bilinu 0-10. Tölurnar
 *           eru útkoma nemanda á fjórum þáttum í námskeiði.
 *           Forritið reiknar út lokaeinkunn.
 *
 *
 ****************************************************/

public class Lokaeinkunn {
    public static void main(String[] args) {
        int N = args.length;
        int[] einkunn = new int[N];
        int[] vaegi = {10, 20, 20, 50};
        double sum = 0.0;
        if (N != 4) {
            System.out.println("Rangur fjöldi");
        } else {
            for (int i = 0; i < N; i++) {
                einkunn[i] = Integer.parseInt(args[i]);
            }
            for (int i = 0; i < N; i++) {
                if (einkunn[i] < einkunn[3]) {
                    vaegi[3] = vaegi[3] + vaegi[i];
                } else {
                    sum += einkunn[i] * vaegi[i];// / 100.0;
                }
            }
            //sum += einkunn[3] * vaegi[3];// / 100.0;
            System.out.println(sum / 100);
        }
    }
}
