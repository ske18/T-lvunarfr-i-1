/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Aha {

    /**
     * Þetta fall deilir heiltölu í heiltölu. Virkar ekki fyrir nkv. tölur.
     *
     * @param a Talan sem deilt er í
     * @param b Deilirinn
     * @return - Útkoman úr deilingunni
     */
    public static int aha(int a, int b) {
        if (a < b) return 0;
        return 1 + aha(a - b, b);
    }

    public static void main(String[] args) {
        System.out.println(aha(8, 2));
        System.out.println(aha(9, 3));
        System.out.println(aha(-7, 3));
        System.out.println(aha(3, -7));
    }
}
