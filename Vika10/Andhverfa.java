import java.awt.*;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Andhverfa {
    /**
     * Fallið tekur inn þrjár heiltölur til að finna lit r, g og b og skilar andhverulit þeirra.
     *
     * @param c litur með eiginleikunum r, g, b.
     * @return - andhverfulitur c.
     */
    public static Color andhverfa(Color c) {
        int r = 255 - c.getRed();
        int g = 255 - c.getGreen();
        int b = 255 - c.getBlue();
        return new Color(r, g, b);
        // return new Color (255-c.getRed(), 255...
    }

    public static void main(String[] args) {
        Color c1 = new Color(100, 150, 30);
        System.out.println(andhverfa(c1));
    }
}
