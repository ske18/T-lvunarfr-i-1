/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið les inn af skipanalínu tvær
 *          heiltölur með ascii kóða þar sem a, b og c
 *          eru char breytur og prentar út abacaba.
 *
 ****************************************************/

public class Stafaruna {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);

        char a = (char) aTala;
        char b = (char) (aTala + bil);
        char c = (char) (aTala + 2 * bil);

        String ruler1 = a + "";
        String ruler2 = ruler1 + b + ruler1;
        String ruler3 = ruler2 + c + ruler2;

        System.out.println(ruler3);
    }
}
