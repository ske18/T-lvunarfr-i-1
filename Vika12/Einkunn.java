/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Einkunn implements Comparable<Einkunn> {
    private static final int LAGMARK = 5;
    private double maetingHlutfall;
    private int lokaprof;

    public Einkunn(double lokaprof1, int lokaprof2) {
        maetingHlutfall = lokaprof1;
        lokaprof = lokaprof2;
    }

    /**
     * Hjálparfall sem segir til hvort m er á bilinu 0.0 til og með 1.0
     *
     * @param m mætingarhlutfall
     * @return true eða false eftir lögmæti m
     */
    private boolean erLoglegt(double m) {
        return m >= 0 && m <= 1.0;
    }

    public int getLokaprof() {
        return lokaprof;
    }

    public void setLokaprof(int l) {
        this.lokaprof = l;
    }

    /**
     * Setur mætingahlutfall sem m ef m er löglegt mætingahlutfall
     *
     * @param m mætingahlutfall á bilinu 0.0 og 1.0 (bæði meðtalin)
     */
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m))
            maetingHlutfall = m;
    }

    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }

    /**
     * Skilar true ef lokaprófseinkunn er stærri eða jafnt og 5.0
     *
     * @return true eða false eftir því hvort lokaprófseinkunn er stærri eða jafnt og 5.0
     */
    public boolean erLagmarkseinkunn() {
        return lokaprof >= LAGMARK;
    }

    //  @Override
    public int compareTo(Einkunn o) {
        return Integer.compare(lokaprof, o.getLokaprof());
     /*   if (this.lokaprof < o.lokaprof) return -1;
        if (this.lokaprof > o.lokaprof) return 1;
        if (this.maetingHlutfall < o.maetingHlutfall) return -1;
        if (this.maetingHlutfall > o.maetingHlutfall) return 1;
        return 0; */
    }

    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }
}
