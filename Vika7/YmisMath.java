/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið hefur main fall og sigmoid fallið.
 *          Fallið skilar gildinu með formúlu og main
 *          fallið prófar fallið.
 *
 ****************************************************/

public class YmisMath {

    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    // prófunaraktygi fyrir sigmoid fallið
    public static void main(String[] args) {
        for (int i = -6; i < 12; i++) {
            System.out.println(sigmoid(i * 0.5) + " " + i * 0.5);
        }
    }
}
