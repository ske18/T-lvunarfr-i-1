import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið les inn 4 tölur sem mynda ramma og
 *          inn 3 tölur sem myndar hring. Hægt er að hafa
 *          marga hringi innan rammans. Ef hringirnir
 *          falla utan rammans koma þeir ekki fram á
 *          myndinni.
 ****************************************************/

public class Hringir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        double x = x1 + x2;
        double y = y1 + y2;
        double b = Math.abs(x2 - x1);
        double h = Math.abs(y2 - y1);
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.rectangle(x / 2.0, y / 2.0, b / 2.0, h / 2.0);
        while (s.hasNext()) {
            double tx = s.nextDouble();
            double ty = s.nextDouble();
            double tr = s.nextDouble();
            if ((tx + tr) < x2 && (tx - tr) > x1 && (ty + tr) < y2 && (ty - tr) > y1) {
                StdDraw.circle(tx, ty, tr);
            }
        }
    }
}
