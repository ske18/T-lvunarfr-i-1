import java.nio.charset.StandardCharsets;
import java.util.Locale;
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

public class FilterOut {
    public static void main(String[] args) {
        double nedri = Double.parseDouble(args[0]);
        double efri = Double.parseDouble(args[1]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        while (s.hasNext()) {
            double t = s.nextDouble();
            if (t < nedri || t > efri) {
                System.out.print(t + " ");
            }
        }
    }
}
