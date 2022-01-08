import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið teiknar umferðarmerki, bláan hring
 *          með rauðum hring yst, og rauða línu sem fer
 *          þvert yfir bláa hringinn. Hægt er að setja
 *          inn gögn til að færa gráður rauðu línunnar
 *          til að sjá hvernig hún henti best.
 ****************************************************/

public class Leggja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        double radius = s.nextDouble();
        double halli = Math.toRadians(s.nextDouble());
        double sinnum = -radius + 0.1 * radius;
        double x1 = sinnum * Math.cos(halli);
        double y1 = sinnum * Math.sin(halli);
        double[] x = {x1, -x1};
        double[] y = {y1, -y1};

        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(0.0, 0.0, radius);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(0.0, 0.0, radius * 0.9);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(radius * 0.05);
        StdDraw.polygon(x, y);
    }
}
