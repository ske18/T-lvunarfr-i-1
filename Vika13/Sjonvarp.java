/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn líkir eftir myndlykli sem tengdur er
 *          í sjónvarp.
 *
 *
 ****************************************************/

public class Sjonvarp implements SjonvarpSkil {
    private boolean kveikt;
    private int nuverandiStod = 1;
    private int stodvar;
    private int timi;
    private String[][] dagskra;

    /**
     * Smiðurinn tekur inn gögn
     *
     * @param dagskra fylki af gögnum sem innihalda dagskrá Sjónvarpsstöðvar.
     */
    public Sjonvarp(String[][] dagskra) {
        this.stodvar = dagskra.length;
        this.dagskra = dagskra.clone();
    }

    public void kveikja() {
        kveikt = true;
    }

    public void slokkva() {
        kveikt = false;
    }

    /**
     * Skiptir um sjónvarpsstöð.
     *
     * @param stod heiltala sem gefur til kynna hvaða stöð á að skipta í.
     */
    public void skiptaUmStod(int stod) {
        if (kveikt && stodvar >= stod) {
            nuverandiStod = stod;
        }
    }

    /**
     *
     */
    public void afram() {
        if (kveikt && timi < dagskra[0].length - 1) {
            timi++;
        }
    }

    /**
     *
     */
    public void afturabak() {
        if (kveikt && timi > 0) {
            timi--;
        }
    }

    public String toString() {
        if (!kveikt) {
            return "";
        }
        return "Á stöð " + nuverandiStod +
                " klukkan " + timi +
                " er " + dagskra[nuverandiStod - 1][timi];
    }

    public static void main(String[] args) {
        int MAXTIMI = Integer.parseInt(args[1]);
        In in = new In(args[0]);
        int fjoldiStodva = Integer.parseInt(args[2]);
        String[][] dagskra = new String[fjoldiStodva][MAXTIMI];
        for (int i = 0; i < fjoldiStodva; i++) {
            dagskra[i] = in.readLine().split(",");
        }
        Sjonvarp s = new Sjonvarp(dagskra);
        s.kveikja();
        s.afram();
        s.skiptaUmStod(2);
        System.out.println("test 1 skipta um stöð: " + s);
        s.skiptaUmStod(fjoldiStodva);
        System.out.println("test 2 síðasta stöð " + s);
        s.afturabak();
        s.skiptaUmStod(2);
        System.out.println("test 3 afturábak " + s);
        for (int i = 0; i < 5; i++)
            s.afram();
        System.out.println("test 4 síðasta klukka " + s);
        s.afram();
        System.out.println("test 5 áfram en ekki hægt að fara lengra: " +
                s);
        s.skiptaUmStod(fjoldiStodva + 1);
        System.out.println("test 6 ólögleg stöð staða óbreytt " + s);
    }
}
