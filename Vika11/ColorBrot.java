import java.awt.*;
import java.util.Arrays;


/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class ColorBrot {

    /**
     * Skilar fjölda ítrana til að athuga ef c=a+ib er í Mandelbrot menginu
     *
     * @param z0 upphafsgildið
     * @param d  mesti fjöldi ítrana sem á að prófa
     * @return fjöldi ítrana
     */
    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }

    /**
     * Forskilyrði er að skrá hafi itranir fjölda lína
     * Les inn liti úr skra og skilar þeim í fylki
     *
     * @param skra    skrá sem á að lesa liti
     * @param itranir fjöldi lita
     * @return itranir margir litir
     */
    public static Color[] lesaColors(String skra, int itranir) {
        In in = new In(skra);
        Color[] colors = new Color[itranir];
        for (int t = 0; t < itranir; t++) {
            int r = in.readInt();
            int g = in.readInt();
            int b = in.readInt();
            colors[t] = new Color(r, g, b);
        }
        return colors;
    }

    /**
     * Les inn úr skrá s ferning
     *
     * @param s nafn á skrá
     * @return skilar ferningshlut
     */
    public static Square lesaMidja(String s) {
        In in = new In(s);
        double xc = in.readDouble();
        double yc = in.readDouble();
        int size = in.readInt();
        return new Square(xc, yc, size);
    }

    /**
     * @param s      ferning fyrir Mandelbrot
     * @param n      stærð myndar
     * @param ITERS  fjöldi ítrana sem á að prófa
     * @param colors litir
     * @return mynd með mandelbroti
     */
    public static Picture reiknaMandelBrot(Square s, int n, int ITERS, Color[] colors) {
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double x = s.getX0(col, n);
                double y = s.getY0(col, n);
                Complex z0 = new Complex(x, y);
                int t = mand(z0, ITERS - 1);
                picture.set(col, n - 1 - row, colors[t]);
            }
        }
        return picture;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ITERS = Integer.parseInt(args[1]);

        Color[] colors = lesaColors("mandel.txt", ITERS);
        System.out.println(Arrays.toString(colors));

        Square square = lesaMidja("midja.txt");
        System.out.println(square);


        Picture picture = reiknaMandelBrot(square, n, ITERS, colors);
        picture.show();
    }
}
