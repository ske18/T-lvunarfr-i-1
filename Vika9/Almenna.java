import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Auka dæmi sem ég gerði ekki.
 *
 *
 *
 ****************************************************/

public class Almenna {
    private static int[] a; // fylki af stuðlum a í fallinu f
    private static int[] b; // fylki af stuðlum b í fallinu f
    private static int c;   // fastinn c í fallinu f
    private static int d;   // grunntilfellið í fallinu f

    /**
     * @param x gildið á x í f(x,y)
     * @param y gildið á y í f(x,y)
     * @param i vísir í parið (a,b) f(x,y)
     * @return gildinu á almenna endurkvæma fallinu f
     */
    public static int f(int x, int y, int i) {
        if (x <= 0 || y <= 0)
            return d;
        if (i == a.length)
            return c;
        return f(x - a[i], y - b[i], 0) + f(x, y, i + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

        String[] fylki = lesaAB(s);
        c = Integer.parseInt(fylki[fylki.length - 2]);
        d = Integer.parseInt(fylki[fylki.length - 1]);

        fylki = getFylki(s);
        int j = 0;
        int[] x = new int[fylki.length / 2];
        int[] y = new int[fylki.length / 2];
        lesaXY(fylki, x, y);

        // prenta út niðurstöðuna
        for (int i = 0; i < x.length; i++)
            System.out.println(f(x[i], y[i], 0));
    }

    /**
     * Les x-i og y-i úr einvíðu fylki
     *
     * @param fylki fylki sem tölurnar eru í
     * @param x     x-i
     * @param y     y-i
     */
    private static void lesaXY(String[] fylki, int[] x, int[] y) {
        int j = 0;
        for (int i = 0; i < fylki.length; i = i + 2) {
            x[j] = Integer.parseInt(fylki[i]);
            y[j++] = Integer.parseInt(fylki[i + 1]);
        }
    }

    /***
     * Lesa inn a-i og b-i af staðalinntaki
     * @param s staðalinntak
     * @return strengjafylki með pörunum (a-i, b-i)
     */
    private static String[] lesaAB(Scanner s) {
        String[] fylki = getFylki(s);
        int j = 0;
        a = new int[(fylki.length - 2) / 2];
        b = new int[(fylki.length - 2) / 2];
        for (int i = 0; i < fylki.length - 2; i = i + 2) {
            a[j] = Integer.parseInt(fylki[i]);
            b[j++] = Integer.parseInt(fylki[i + 1]);
        }
        return fylki;
    }

    /**
     * Les inn fylki úr línu
     *
     * @param s staðalinntak
     * @return fylki
     */
    private static String[] getFylki(Scanner s) {
        String temp = s.nextLine();
        String[] fylki = temp.split(" ");
        return fylki;
    }
}
