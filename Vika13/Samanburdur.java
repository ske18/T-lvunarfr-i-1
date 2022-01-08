import java.util.Arrays;
import java.util.Comparator;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Samanburdur {
    public static void main(String[] args) {
        // Fylkið sem á að raða
        String[] arstidir = {"Sumar", "Vetur", "Vor", "Haust"}; // inntakið
        Comparator<String> rodArstida = (s1, s2) -> Integer.compare(getN(s1), getN(s2));
        Arrays.sort(arstidir, rodArstida); // raða arstidir í fylki eftir rodArstida
    }

    /**
     * Finnur sætið á s í röð árstíða
     *
     * @param s árstíð
     * @return sæti árstíðarinnar
     */
    private static int getN(String s) {
        String[] rod = {"Vetur", "Sumar", "Vor", "Haust"};
        for (int i = 0; i < rod.length; i++) {
            if (s.equals(rod[i]))
                return i;
        }
        return 0;

    }
}
