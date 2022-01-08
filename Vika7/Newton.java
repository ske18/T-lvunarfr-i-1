/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Lesa af skipanalínu kommutölu og prenta út kvaðratrótina
 *
 *
 *
 ****************************************************/

public class Newton {
    // main fallið verður eins konar prófunaraktygi
    public static void main(String[] args) {
// lesa inn gögnin af skipanalínunni
        double[] a = new double[args.length]; // búa til fylkið
        for (int i = 0; i < args.length; i++) {
            a[i] = Double.parseDouble(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
            double x = sqrt(a[i]);
            System.out.println(x);
        }
    }

    public static double sqrt(double c) {
        if (c < 0)
            return Double.NaN;
        double EPS = 1.0e-15;
        double t = c;
        while (Math.abs(t - c / t) > EPS * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
}
