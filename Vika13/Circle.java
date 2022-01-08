/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Circle extends Shape {

    public Circle(double w) {
        setWidth(w);
    }

    public double getArea() {
        return Math.pow(getWidth() / 2, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.printf(" %5.2f %n", c.getArea());
    }
}
