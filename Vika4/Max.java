/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið finnur hæsta punkt falls með Newton
 *          Raphson aðferðinni og ítrar þar til er minna
 *          en talan sem tekin er inn af skipanalínu.
 *
 ****************************************************/

public class Max {
    public static void main(String[] args) {
        double m = Double.parseDouble(args[0]); // tolerance sem á að ná
        double fx1, fx2;
        double xn = 0.0;
        double x = 0.0;                           // upphafsgildi er 0.0
        double dx = Double.MAX_VALUE;
        while (Math.abs(dx) > Math.abs(m)) {
            fx1 = 9 * x * x - 20 * x - 56;      // f diffrað
            fx2 = 18 * x - 20;                  // f tvídiffrað
            xn = x;
            x = xn - fx1 / fx2;                 // xn+1 reiknað
            dx = x - xn;
        }
        System.out.println("xn er " + xn);
    }
}
