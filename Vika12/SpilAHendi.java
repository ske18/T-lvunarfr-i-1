import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn heldur utan um spil á hendi og notar
 *          API úr spil.java. Klasinn inniheldur gögn um
 *          mestan fjölda spila á hendi, fjölda spila á
 *          hendi hverju sinni og spil sem eru á hendi.
 ****************************************************/

public class SpilAHendi {
    private Spil[] spilFylki;
    private int MAX;
    private int index;

    public SpilAHendi(int n) {
        spilFylki = new Spil[n];
        MAX = n - 1;
        index = 0;
    }

    /**
     * Athugar hvort spil sé á hendi.
     *
     * @param s er spil af klasanum Spil.
     * @return skilar true ef spil er á hendi annars false.
     */
    private boolean erSpilAHendi(Spil s) {
        for (Spil t : spilFylki) {
            if (t != null && t.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Aðferðin bætir við spili á hendi.
     *
     * @param s af klasanum Spil er spilið sem bætt er við.
     */
    public void baetaVidSpili(Spil s) {
        if (index <= MAX) {
            if (!erSpilAHendi(s)) {
                spilFylki[index++] = s;
            }
        }
    }


    /**
     * Aðferðin tekur það spil af hendi sem síðast var sett á höndina og skilar því.
     *
     * @return spil af klasanum Spil eða engu.
     */
    public Spil takaSpilAfHendi() {
        if (index > 0) {
            return spilFylki[--index];
        } else {
            return null;
        }
    }

    public String toString() {
        return "SpilAHendi{" +
                "MAX=" + MAX +
                ", spilFylki=" + Arrays.toString(spilFylki) +
                '}';
    }

    public static void main(String[] args) {
        int FJOLDI = 5;
        String[] rank = {"Ás", "Tvistur", "Þristur", "Fjarki", "Fimma",
                "Sexa", "Sjöa", "Átta", "Nía", "Tía", "Gosi", "Drottning", "Kóngur"};

        String[] suit = {"Hjarta", "Spaði", "Tígull", "Lauf"};

        SpilAHendi hendi = new SpilAHendi(FJOLDI);

        Spil s1 = new Spil(suit[StdRandom.uniform(suit.length)],
                rank[StdRandom.uniform(rank.length)]);
        hendi.baetaVidSpili(s1);

        Spil s2 = new Spil(suit[StdRandom.uniform(suit.length)],
                rank[StdRandom.uniform(rank.length)]);
        hendi.baetaVidSpili(s2);

        System.out.println(hendi);
        System.out.println(hendi.takaSpilAfHendi());
        System.out.println(hendi);
        System.out.println(hendi.takaSpilAfHendi());
    }
}
