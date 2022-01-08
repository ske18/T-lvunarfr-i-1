/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið tekur þrjú heiltöluviðföng og setur
 *          í breytur a, b og c af skipanalínunni. Hún
 *          prentar true ef b er minnst en annars false.
 *
 ****************************************************/

public class MinnstaMidja {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isLeast;

        isLeast = (a > b) && (c > b);

        System.out.print("miðjustakið af " + a + ", " + b + ", " + c + " er minnst: ");
        System.out.println(isLeast);
    }
}
