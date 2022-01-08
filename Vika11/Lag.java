/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : klasinn Lag inniheldur titil, og flytjanda
 *          lags og hvar það er á top 40 lagalista RUV,
 *          frá 1 og upp í 40.
 *
 ****************************************************/

public class Lag {
    private String titill;
    private String flytjandi;
    private int saetiTop40RUV;

    /**
     * Býr til Lag sem inniheldur tvo strengi sem eru titill á lagi og flytjandi lags.
     *
     * @param titill    Strengur
     * @param flytjandi Strengur
     */
    public Lag(String titill, String flytjandi) {
        this.titill = titill;
        this.flytjandi = flytjandi;
    }

    public String getTitill() {
        return titill;
    }

    public String getFlytjandi() {
        return flytjandi;
    }

    public int getSaetiTop40RUV() {
        return saetiTop40RUV;
    }

    /**
     * Vantaði java doc lýsingu hér því þetta er stærri setter
     *
     * @param saeti heiltala
     * @return því sæti sem á við
     */
    public int setSaetiTop40RUV(int saeti) {
        int preSaeti = this.saetiTop40RUV;
        this.saetiTop40RUV = saeti;
        if (preSaeti == 0) {
            return 40;
        } else if (saeti == 0) {
            return preSaeti - 40;
        } else return preSaeti - saeti;
    }

    public String toString() {
        return "Lag{" +
                "titill='" + titill + '\'' +
                ", flytjandi='" + flytjandi + '\'' +
                ", saetiTop40RUV=" + saetiTop40RUV +
                '}';
    }

    public static void main(String[] args) {
        Lag lag1 = new Lag("Næsta líf", "GDRN");
        System.out.println(lag1);
        System.out.println(lag1.setSaetiTop40RUV(1));
        System.out.println(lag1.getSaetiTop40RUV());
        System.out.println(lag1.setSaetiTop40RUV(20));
        System.out.println(lag1.setSaetiTop40RUV(18));
        System.out.println(lag1.setSaetiTop40RUV(10));
        System.out.println(lag1.getSaetiTop40RUV());
        System.out.println(lag1.getTitill());
        System.out.println(lag1.getFlytjandi());
    }
}
