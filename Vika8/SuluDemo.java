/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class SuluDemo {
    public static void main(String[] args) {
        //Lesa inn N sem segir til um fjölda súlna
        int N = Integer.parseInt(args[0]);
        double[] a = new double[N];
        StdDraw.setYscale(0, 100);
        StdDraw.setPenColor(StdDraw.BLUE);
        //finna N slembitölur á bilinu 0 og að 100
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(0, 100);
        }
        // teikna súlurit með þessum slembitölum
        StdStats.plotBars(a);
    }
}
