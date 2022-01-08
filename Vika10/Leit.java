/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið leit tekur inn nafn á skrá og orð úr
 *          annarri textaskrá og telur fjölda orða.
 *
 *
 ****************************************************/

public class Leit {
    /**
     * Aðferðin leit leitar í nafnASkra eftir fjölda lína sem innihalda ord og tilgreinir fjölda lína.
     *
     * @param nafnASkra strengur.
     * @param ord       strengur.
     * @return fjöldi lína í nafnASkra sem innihalda ord.
     */
    public static int leit(String nafnASkra, String ord) {
        In s = new In(nafnASkra);
        int linutala = 0;
        while (s.hasNextLine()) {
            String lina = s.readLine();
            if (lina.contains(ord))
                linutala++;
        }
        s.close();
        return linutala;
    }

    public static void main(String[] args) {
       /* System.out.println("heiltalan " + leit("nemendur.text", "@"));
        System.out.println("heiltalan " + leit("nemendur.text", "dóttir"));
        System.out.println("heiltalan " + leit("nemendur.text", "Reykjavík"));
        System.out.println("heiltalan " + leit("nemendur.text", "son")); */
        System.out.println(leit(args[0], args[1]));
    } // setja í args nemendur.text svo @ eða dóttir, Reykjavík, son
}
