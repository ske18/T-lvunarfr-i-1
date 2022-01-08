/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Prenta út n línur af m stjörnum þar sem n og
 * m eru teknar af skipanalínu
 *
 *
 ****************************************************/

public class Stjornukassi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // fjöldi lína
        int m = Integer.parseInt(args[1]); // fjöldi stjarna

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
