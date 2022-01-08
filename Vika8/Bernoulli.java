/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Bernoulli {
    /*
    public static void main(String[] args) {
        // lesa inn fjölda króna
        // lesa inn fjölda tilrauna í hermun
        int fjoldiKrona = Integer.parseInt(args[0]);
        int fjoldiTilrauna = Integer.parseInt(args[1]);

        //kasta krónum í svo mörgum tilraunum og fá út tíðni
        int[] tidni = kastaKronum(fjoldiKrona, fjoldiTilrauna);

        //teikna súluritið fyrir krónukastið
        teiknaSulurit(tidni, fjoldiTilrauna);

        //teikna Gaussian dreifinguna
        teiknaGaussian(fjoldiKrona);

    }

    public static void teiknaGaussian(int fjoldiKrona) {
    }

    /**
     * Teikna súlurit fyrir normalíseraða tíðni
     *
     * @param tidni          tíðnin á dreifingunni
     * @param fjoldiTilrauna fjöldi tilrauna í hermuninni
     */
/*
    public static void teiknaSulurit(int[] tidni, int fjoldiTilrauna) {
        double[] normalized = new double[tidni.length];
        for (int i = 0; i < tidni.length; i++) {
            normalized[i] = (double) tidni[i] / fjoldiTilrauna
        }
        StdStats.plotBars(normalized);
    }

    public static int[] kastaKronum(int fjoldiKrona, int fjoldiTilrauna) {

    }

 */
    // number of heads when flipping n biased-p coins
    public static int binomial(int n, double p) {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli(p)) {
                heads++;
            }
        }
        return heads;
    }

    // number of heads when flipping n fair coins
    // or call binomial(n, 0.5)
    public static int binomial(int n) {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads++;
            }
        }
        return heads;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        // number of coins to flip per trial
        int trials = Integer.parseInt(args[1]);   // number of trials

        StdDraw.setYscale(0, 0.2);

        // flip n fair coins, trials times
        int[] freq = new int[n + 1];
        for (int t = 0; t < trials; t++) {
            freq[binomial(n)]++;
        }

        // plot normalized values
        double[] normalized = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            normalized[i] = (double) freq[i] / trials;
        }
        StdStats.plotBars(normalized);

        // plot Gaussian approximation
        double mean = n / 2.0;
        double stddev = Math.sqrt(n) / 2.0;
        double[] phi = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            phi[i] = Gaussian.pdf(i, mean, stddev);
        }
        StdStats.plotLines(phi);
    }
}

