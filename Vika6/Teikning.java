import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : 
 *
 *
 *
 ****************************************************/

public class Teikning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

        double radius = s.nextDouble();
        double halli = s.nextDouble();
        StdDraw.setXscale(-1.0, 1.0);
// eins fyrir Yscale

        StdDraw.filledCircle(0.0, 0.0, radius);
        
        double[] x = {};
    }
}
