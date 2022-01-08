/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Lýsir þríhyrningi og getur reiknað flatarmál hans
 *
 *
 *
 ****************************************************/

public class Triangle extends Shape {

    public Triangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }

    public static void main(String[] args) {

    }
}
