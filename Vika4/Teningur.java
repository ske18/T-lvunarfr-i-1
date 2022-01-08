/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið kastar t teningum með 6 hliðum og
 *          telur hve oft hliðin h á teningi kemur upp
 *          og prentar þá útkomu.
 *
 ****************************************************/

public class Teningur {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]); // fjöldi teninga
        int h = Integer.parseInt(args[1]); // hversu oft hlið kemur upp
        int fjoldi = 0;
        if (h < 1 || h > 6) {
            System.out.println("Ólögleg hlið");
        } else {
            for (int i = 0; i < t; i++) {
                if (StdRandom.uniform(1, 7) == h)
                    fjoldi++;
            }
            System.out.println(fjoldi);
        }
    }
}

