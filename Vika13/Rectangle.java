/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Lýsir ferhyrningi og getur reiknað flatarmál hans
 *
 *
 *
 ****************************************************/

public class Rectangle extends Shape {
    // engar viðbótar tilviksbreytur umfram Shape breyturnar

    // smiður
    public Rectangle(double height, double width) {
        setHeight(height); // setHeight er aðferð á Shape og er aðgengileg undirklasanum
        setWidth(width);
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public static void main(String[] args) {

    }
}
