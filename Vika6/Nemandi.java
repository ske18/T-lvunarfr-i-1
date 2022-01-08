/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Geymir nafn og tölvupóst nemanda
 *
 *
 *
 ****************************************************/

public class Nemandi {
    private String nafn; // nafn nemanda
    private String tpostur; // tölvupóstur nemanda

    /**
     * Smiður sem tekur nafn og tölvupóst nemanda
     *
     * @param n nafn nemanda
     * @param t tölvupóstur nemanda
     */
    public Nemandi(String n, String t) {
        nafn = n;
        tpostur = t;
    }

    public String getNafn() {
        return nafn;
    }

    public String getTpostur() {
        return tpostur;
    }

    public void setNafn(String n) {
        nafn = n;
    }

    public String toString() {
        return "Nemandi{" +
                "nafn='" + nafn + '\'' +
                ", tPostur='" + tpostur + '\'' +
                "}";
    }

    public boolean equalsString(String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        return equals(n);
    }

    public static void main(String[] args) {

    }
}
