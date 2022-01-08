/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Einkunn klasinn geymir mætingarhlutfall og
 *          lokaprófseinkunn fyrir tiltekinn ótilgreindan
 *          nemanda.
 *
 ****************************************************/

public class EinkunnVika12 {
    private double maetingHlutfall;
    private int lokaprof;


    public static void main(String[] args) {
        EinkunnVika12 e = new EinkunnVika12(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        EinkunnVika12 e2 = new EinkunnVika12(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }

    public EinkunnVika12(double maetingHlutfall, int lokaprof) {
        if (erLoglegt(maetingHlutfall))
            this.maetingHlutfall = maetingHlutfall;
        this.lokaprof = lokaprof;
    }

    public String toString() {
        return "Einkunn{" +
                "maetingHlutfall=" + maetingHlutfall +
                ", lokaprof=" + lokaprof +
                '}';
    }

    //Hjálparfall sem segir til hvort m er á bilinu 0.0 til og með 1.0
    private boolean erLoglegt(double maetingHlutfall) {
        if (maetingHlutfall >= 0.0 && maetingHlutfall <= 1.0) {
            return true;
        }
        return false;
    }

    public int getLokaprof() {
        return lokaprof;
    }

    public void setLokaprof(int lokaprof) {
        this.lokaprof = lokaprof;
    }

    //Setur mætingarhlutfall sem m ef m er löglegt mætingarhlutfall


    public void setMaetingHlutfall(double maetingHlutfall) {
        if (erLoglegt(maetingHlutfall))
            this.maetingHlutfall = maetingHlutfall;

    }

    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }

    //Skilar true ef lokaprófseinkunn er stærri eða jafnt og 5.0
    public boolean erLagmarkseinkunn() {
        if (lokaprof >= 5.0) {
            return true;
        }
        return false;
    }
}
