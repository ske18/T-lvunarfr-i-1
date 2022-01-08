/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Lýsir rafhleðslu í punkti
 *
 *
 *
 ****************************************************/

public class ChargeTest {
    //Tilviksbreytur
    private double rx; // x staðsetningin - breytum ekki staðsetningu
    private double ry;
    private double q; // rafhleðsla

    // Smiðir
    public ChargeTest(double x0, double y0, double q0) {
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

    public String toString() {
        return q + "at (" + rx + ", " + ry + ")";
    }

    public static void main(String[] args) {
        // lesa inn staðsetningu
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        // búa til/smíðum 2 charge hluti
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        double v1 = c1.potentialAt(x, y);
        System.out.println(v1);
        System.out.println(c1);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        System.out.println(c2);

    }
}
