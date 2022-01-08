/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/
public class Stjornur {
    public static String stjarna(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

    public static void main(String[] args) {
        System.out.println(stjarna(1));
    }

}



