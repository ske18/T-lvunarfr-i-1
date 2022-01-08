import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið les inn tölu af staðalinntaki sem
 *          ákvarðar stærð fylkis. Síðan reiknar forritið
 *          hornasummu fylkisins, frá efra hægra horni
 *          ská niður í vinstra horn.
 ****************************************************/

public class HSumma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        int N = s.nextInt();
        int[][] a = new int[N][N];

        while (s.hasNext()) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    a[i][j] = s.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + a[i][N - i - 1];
        }
        System.out.print(sum);
    }
}

