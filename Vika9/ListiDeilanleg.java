import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið tekur inn fylki af heiltölum  og
 *          skilar streng af þeim heiltölum úr fylkinu,
 *          með einu bili á milli, frá og með staki n,
 *          sem eru deilanlegar með tölunni deilir.
 ****************************************************/

public class ListiDeilanleg {

    /**
     * Tekur inn fylki og skilar streng af þeim tölum sem eru deilanlegar með deilir
     *
     * @param listi  listi af heiltölum sem á að nota til grundvallar
     * @param deilir deila með deili í tölu
     * @param n      athuga tölur á listanum frá og með
     * @return skilar streng með tölum deilanlegum með deilir
     * @throws RuntimeException - ef n fer út fyrir listann
     */
    public static String deilanleg(int[] listi, int deilir, int n) throws RuntimeException {
        if (n < 0 || n > listi.length)
            throw new RuntimeException("Utan marka");
        String stak = "";
        if (n == listi.length)  // komin út á enda
            return "";
        if (listi[n] % deilir == 0)
            stak = listi[n] + " ";
        return stak + deilanleg(listi, deilir, n + 1);
    }


    public static void main(String[] args) {
        int[] listi = {3, 4, 7, 14};
        int[] listi2 = {3, 4, 7, 14};
        try {
            System.out.println(Arrays.toString(listi));
            System.out.println(deilanleg(listi, 7, 0));
            System.out.println(Arrays.toString(listi2));
            System.out.println(deilanleg(listi, 2, 2));
            System.out.println(deilanleg(listi, 2, 6));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
