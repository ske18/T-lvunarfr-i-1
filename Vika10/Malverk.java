import java.awt.*;
import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :Fallið málar mynd í slembilituðum ferningum
 *         sem aðeins eru teiknaðir einu sinni.
 *
 *
 *
 ****************************************************/

public class Malverk {
    /**
     * Teiknar málverk sem samanstendur af n*m ferningum þar sem hver ferningur er af
     * hálfbreidd b. Ferningar eru teiknaðir í slembilit. Hver ferningur er aðeins teiknaður
     * einu sinni. tilraunir eru gerðar til að teikna ferning.
     *
     * @param n         fjöldi lína af ferningum.
     * @param m         fjöldi lína af dálkum.
     * @param b         hálfbreidd fernings.
     * @param tilraunir fjöldi tilrauna sem eru gerðar til að teikna ferning.
     * @return fylki af n*m litum sem voru notaðir til að mála ferninga af hálfbreidd b í tilraunir tilraunum.
     */
    public static Color[][] mala(int n, int m, double b, int tilraunir) {

        Color[][] a = new Color[n][m];
        for (int i = 0; i < tilraunir; i++) {
            int x = StdRandom.uniform(0, n);
            int y = StdRandom.uniform(0, m);
            if (a[x][y] == null) {
                int rautt = StdRandom.uniform(256);
                int graent = StdRandom.uniform(256);
                int blatt = StdRandom.uniform(256);
                Color c = new Color(rautt, graent, blatt);
                a[x][y] = c;
                StdDraw.setPenColor(c);
                StdDraw.filledSquare(x * 2 * b + b, y * 2 * b + b, b);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        //Color[][] litir = mala(5, 10, 0.03, 100);
        //System.out.println(Arrays.deepToString(litir));
        Color[][] litir2 = mala(100, 100, 0.05, 1000000);
        System.out.println(Arrays.deepToString(litir2));

    }
}
