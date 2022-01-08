/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fall sem telur hversu tölur eru minni en
 *          tala í fylki.
 *
 *
 *
 ****************************************************/

public class Minni {
    /**
     * Fallið reiknar út miðjusætið og finnur tölur á milli i og j.
     *
     * @param a    heiltölufylki
     * @param i    heiltala
     * @param j    heiltala
     * @param tala heiltala
     * @return - hvað eru margar tölur minni en tala í hlutfylkinu á milli i og j.
     */
    public static int minniEn(int[] a, int i, int j, int tala) {
        if (j < i) {
            return 0;
        }
        int midja = (i + j) >>> 1;
        if (a[midja] < tala) {
            return ((midja - i + 1) + minniEn(a, midja + 1, j, tala));
        } else return minniEn(a, i, midja - 1, tala);
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int t = minniEn(a, 0, a.length - 1, 6);
        System.out.println(t); // prentast 5
        t = minniEn(a, 0, a.length - 1, 2);
        System.out.println(t); // prentast 1
        int t1 = minniEn(a, 0, a.length - 1, 3);
        System.out.println(t1);
    }
}
