/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn prentar út heiltölur frá 1 upp í 200
 *          og prentar út Hæ ef tala gengur upp í 3, Hó
 *          ef tala gengur upp í 5 og Hí ef tala gengur
 *          upp í 7.
 ****************************************************/

public class HaeHoHi {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.print("Hæ");
            }
            if (i % 5 == 0) {
                System.out.print("Hó");
            }
            if (i % 7 == 0) {
                System.out.print("Hí");
            }
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i);
            }
            if (i % 12 == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }

        }
    }
}
