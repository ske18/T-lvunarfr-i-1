import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn lýsir talningu sem starfsmaður gerir
 *          á viðskiptavinum verslunar.
 *
 *
 ****************************************************/

public class Tekk {

    /**
     * tekk tekur inn á staðalinntaki tölur eða orðið missti, eftir því hvort
     * afgreiðslumaður sem er að telja viðskiptavini nær að telja eða missir af
     * því að telja.
     *
     * @return fjölda viðskiptavina sem voru taldir, eða Gölluð ef talningin var gölluð.
     */
    public static String tekk() {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int tala = 0;
        String missti = "missti";
        while (s.hasNext()) {
            String string = s.next();
            if (missti.equals(string)) {
                tala++;
            } else if (tala + 1 == Integer.parseInt(string)) {
                tala++;
            } else return "Gölluð";
        }
        String streng = Integer.toString(tala);
        return streng;
    }


    public static void main(String[] args) {
        System.out.println(tekk());
    }
}
