import java.util.Objects;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn Charge lýsir rafhleðslu í punkti.
 *          Hér er klasinn Charge endurskrifaður þannig
 *          að tveir Charge hlutir séu jafnir ef þeir
 *          eru í sömu staðsetningu og með sömu hleðslu.
 *          hashCode aðferðin er endurskrifuð með Objects
 *          hash().
 ****************************************************/

public class Charge {
    //Tilviksbreytur
    private double rx; // x staðsetningin - breytum ekki staðsetningu
    private double ry;
    private double q; // rafhleðsla

    // Smiðir
    public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    // Aðferðir
    public double potentialAt(double x, double y) {
        double k = 8.99e09; // k er local breyta lifir bara í aðferðinni og dx
        double dx = x - rx; // x er parameter breyta og rx er tilviksbreyta
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Object c) {
        if (c == null) return false;
        if (this.getClass() != c.getClass()) return false;
        Charge that = (Charge) c;
        return (this.rx == that.rx) && (this.ry == that.ry);
    }

    public int hashCode() {
        return Objects.hash(rx, ry);
    }

    public String toString() {
        return q + "at (" + rx + ", " + ry + ")";
    }

    public static void main(String[] args) {
        // Charge c1 = new Charge(0.51, 0.63, 21.3);
        //  Charge c2 = new Charge(0.51, 0.63, 21.3);
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        System.out.println(c1.equals(c2));
    }
}

