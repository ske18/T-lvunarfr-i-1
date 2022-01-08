/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið tekur inn jákvæða eða neikvæða
 * heiltölu af skipanalínu og prentar út runu.
 *
 *
 ****************************************************/

public class Runa {
    public static void main(String[] args) {
        try {
            int tala = Integer.parseInt(args[0]);
            int runa = 0;
            if (tala > 0) {
                for (int i = 1; i <= tala; i++) {
                    if (tala % i == 0) {
                        System.out.print(1);
                        ++runa;
                    } else {
                        System.out.print(0);
                    }
                }
            } else {
                for (int i = -1; i >= tala; i--) {
                    if (tala % i == 0) {
                        System.out.print(1);
                        ++runa;
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
            System.out.print(runa);
        } catch (NumberFormatException e) {
            System.out.println("Ólöglegt inntak");
        }
    }
}

//                 System.out.print(tala % i == 0 ? "1" : "0");
