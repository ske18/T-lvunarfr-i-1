/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn reiknar út rúmmál og yfirborðs-
 *          flatarmál píramída.
 *
 *
 ****************************************************/

public class Pyramid extends Shape {
    private double h;

    /**
     * Smiðurinn tekur inn gögn
     *
     * @param height  lengd
     * @param width   breidd
     * @param pheight hæð
     */
    public Pyramid(double height, double width, double pheight) {
        setHeight(height);
        setWidth(width);
        h = pheight;
    }

    /**
     * reiknar út yfirborðsflatarmál pýramída.
     *
     * @return kommutala.
     */
    public double getArea() {
        double w = getWidth();
        double l = getHeight();
        return (l * w + l * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2))
                + w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2)));
    }

    /**
     * getVolume reiknar út rúmmál pýramída.
     *
     * @return kommutala.
     */
    public double getVolume() {
        return (getHeight() * getWidth() * h) / 3;
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid(3.0, 4.0, 2.0);
        System.out.printf("%5.2f %n", p.getArea());
        System.out.printf("%5.2f %n", p.getVolume());
    }
}
