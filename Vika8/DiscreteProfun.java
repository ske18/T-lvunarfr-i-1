import java.util.Arrays;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið discreteLikur tekur inn tölur og
 *          finnur líkindadreifingu. Prófunarfallið
 *          finnur dreifingu á atburðum.
 *
 ****************************************************/

public class DiscreteProfun {

    /**
     * Tekur líkur á atburði og finnur samsvarandi dreifingu.
     *
     * @param likur líkur á atburði
     * @param n     dreifing atburða
     * @return fylkið finna sem finnur samsvarandi líkindadreifingu
     */
    public static int[] discreteLikur(double[] likur, int n) {
        int[] finna = new int[n];
        for (int i = 0; i < n; i++) {
            finna[i] = StdRandom.discrete(likur) + 1;
        }
        return finna;
    }

    public static void main(String[] args) {
        /* ekki ítarleg prófun í main falli svo..
        double[] likindi = {0.30, 0.05, 0.05, 0.05, 0.05, 0.50};
        int[] utkoma = discreteLikur(likindi, 10);
        System.out.print(Arrays.toString(utkoma));

         */
        StdRandom.setSeed(30);
        double[] l1 = {0.4, 0.6};
        int[] utkoma = discreteLikur(l1, 50);
        System.out.println(Arrays.toString(utkoma));
        double[] l2 = {0.5, 0.5};
        int[] utkoma2 = discreteLikur(l2, 10);
        System.out.println(Arrays.toString(utkoma2));
        double[] l3 = {0.3, 0.05, 0.05, 0.05, 0.05, 0.5};
        int[] utkoma3 = discreteLikur(l3, 10);
        System.out.println(Arrays.toString(utkoma3));

    }
}
