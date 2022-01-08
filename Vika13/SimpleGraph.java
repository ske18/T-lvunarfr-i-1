/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class SimpleGraph {
    // plots the function f in the interval [a, b] using n+1 evenly spaced points
    public static void plot(Reikna f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.reikna(a + delta * i);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        Reikna r = x -> x * x; // breytan r útfærir Reikna interface með því að skilgreina lambda segð
        plot(r, a, b, 50);
    }
}
