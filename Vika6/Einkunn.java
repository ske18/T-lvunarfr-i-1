import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið les kommutölu inn af skipanalínu
 *          sem segir til um lágmarkseinkunn til að
 *          standast námskeið. Svo fær það einkunnir af
 *          staðalinntaki og skilar prósentuhluta
 *          nemenda sem stóðust prófið.
 ****************************************************/

public class Einkunn {
    public static void main(String[] args) {
        double leinkunn = Double.parseDouble(args[0]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int t = 0;
        int v = 0;
        while (s.hasNext()) {
            t++;
            double einkunn = s.nextDouble();

            if (einkunn > leinkunn) {
                v++;
            }
        }
        double hlutfall = (100.0 * v) / t;
        System.out.printf(v + " nemendur sem náðu er %.1f%%%n", hlutfall);
    }
}
