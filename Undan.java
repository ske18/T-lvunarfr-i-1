/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn tekur inn 6 heiltölur og athugar
 *          hvort dagsetningin er á undan þar sem er
 *          dagur mánuður og ár í dagsetningu.
 *
 *
 *
 ****************************************************/

public class Undan {
    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int ar1 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int ar2 = Integer.parseInt(args[5]);
      /*  Vitlaust - leiðrétt fyrir neðan
        boolean isDateFirst;

        isDateFirst = (ar1 <= ar2);

        isDateFirst = isDateFirst && (m1 <= m2);

        isDateFirst = isDateFirst && (d1 <= d2);

       */
        boolean isDateFirst = ar1 < ar2 || (ar1 == ar2) && m1 < m2 ||
                ar1 == ar2 && m1 == m2 && d1 < d2;

        System.out.print("Fyrri dagsetningin er á undan seinni: ");
        System.out.println(isDateFirst);
    }
}
