/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið á að mynda ríkisstjórn og tekur af
 *          skipanalínu fjölda þingmanna í hverjum flokki,
 *          fjölda þingmanna svo hægt sé að mynda stjórn
 *          og hámarksfjölda flokka.
 ****************************************************/

public class Rikisstjorn {
    public static void main(String[] args) {
        int N = args.length;
        int[] flokkur = new int[N - 2];
        final int meirihluti = Integer.parseInt(args[N - 2]);
        final int MAX = Integer.parseInt(args[N - 1]);
        char[] bokstafur = {'B', 'C', 'D', 'F', 'J', 'M', 'P', 'S', 'V'};

        //Umbreyta fjölda þingmanna á skipanalínu í heiltölur
        for (int i = 0; i < N - 2; i++) {
            flokkur[i] = Integer.parseInt(args[i]);
        }

        // Stokka flokkana og bókstafina í fylkinu - þarf bara að stokka MAX tölur
        for (int i = 0; i < MAX; i++) {
            int random = StdRandom.uniform(i, N - 2);
            char t = bokstafur[random];
            bokstafur[random] = bokstafur[i];
            bokstafur[i] = t;
            int f = flokkur[random];
            flokkur[random] = flokkur[i];
            flokkur[i] = f;
        }
        // Finna ríkisstjórnina
        int fjoldi = 0;
        int stjornarflokkar = 0;
        String stjorn = " ";
        while (fjoldi < meirihluti && stjornarflokkar < MAX) {
            fjoldi += flokkur[stjornarflokkar];
            stjorn += bokstafur[stjornarflokkar];
            stjornarflokkar++;
        }
        if (fjoldi >= meirihluti)
            System.out.println(stjorn + " " + fjoldi + " " + MAX);
        else
            System.out.println("Ekki tókst að mynda stjórn með " + stjornarflokkar + "flokkum " + stjorn);
    }
}
