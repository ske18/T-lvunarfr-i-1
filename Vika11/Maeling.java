/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið maelaDouble tímamælir fjölda skrefa.
 *
 *
 *
 ****************************************************/

public class Maeling {
    public static void main(String[] args) {
        System.out.println(maelaDouble(1000000000));
        System.out.println(maelaDouble(100000000));
    }

    public static double maelaDouble(int fjoldiSkrefa) {
        Stopwatch s = new Stopwatch();
        double total = 0;
        for (int i = 0; i < fjoldiSkrefa; i++)
            total += i;
        return s.elapsedTime();
    }

}
