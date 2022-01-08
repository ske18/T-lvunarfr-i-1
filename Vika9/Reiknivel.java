/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Endurkvæmt fall sem margfaldar saman tvær
 *          heiltölur og skilar niðurstöðunni.
 *
 *
 ****************************************************/

public class Reiknivel {

    /**
     * Endurkvæma fallið margfoldun margfaldar saman a og b.
     *
     * @param a Fyrri heiltalan í margfoldun.
     * @param b Seinni heiltalan í margfoldun.
     * @return - Skilar a * b.
     */
    public static int margfoldun(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            return -a + margfoldun(a, b + 1);
        }
        return a + margfoldun(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(margfoldun(2, 3));
        System.out.println(margfoldun(-2, 3));
        System.out.println(margfoldun(-2, -2));
        System.out.println(margfoldun(0, -2));
    }
}
