import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn hefur þrjár aðferðir til að finna
 *          hvort orð sé í nemendaskrá sem er lesin af
 *          staðalinntaki og skilar í hversu mörgum
 *          línum hægt sé að finna orðið.
 ****************************************************/

public class Nemendaskra {
    /**
     * Bætir við nemandi aftast í nemendaSkra.
     * Forskilyrði er að það sé pláss fyrir einn nemanda til viðbótar.
     *
     * @param nemendaSkra fylki af nemendum.
     * @param nemandi     nemandi með nafn og tölvupóstfang.
     * @throws RuntimeException - ef reynt er að bæta við nemanda og ekki er pláss þá er exception kastað.
     */
    public static void baetaVid(Nemandi[] nemendaSkra, Nemandi nemandi) throws RuntimeException {
        int i = 0;
        if (!erFull(nemendaSkra)) {
            while (nemendaSkra[i] != null) {
                i++;
            }
            nemendaSkra[i] = nemandi;
        }
    }

    /**
     * Leitar að nemandi í nemendaSkra og skilar nemanda ef hann finnst en annars skilar aðferðin null.
     *
     * @param nemendaSkra fylki af nemendum.
     * @param gogn        Strengur sem inniheldur nafn og tölvupóstfang sem á að leita að.
     * @return Nemandi hlutur ef nemandi fannst með nafni og tölvupóstfangi í gogn en annars null.
     */
    public static Nemandi finna(Nemandi[] nemendaSkra, String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        for (Nemandi i : nemendaSkra) {
            if (n.equals(i)) {
                return i;
            }
        }
        return null;
    }

    /**
     * @param nemendaSkra fylki af nemendum.
     * @return - true ef skráin er full annars false.
     */
    private static boolean erFull(Nemandi[] nemendaSkra) {
        return nemendaSkra[nemendaSkra.length - 1] != null;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Nemandi[] nemendaSkra = new Nemandi[N];
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        while (s.hasNextLine()) {
            String inntak = s.nextLine();
            String[] gogn = inntak.split(",");
            Nemandi nemandi = finna(nemendaSkra, gogn);
            try {
                if (nemandi == null) {
                    nemandi = new Nemandi(gogn[0], gogn[1]);
                    baetaVid(nemendaSkra, nemandi);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println(Arrays.toString(nemendaSkra));
    }
}
