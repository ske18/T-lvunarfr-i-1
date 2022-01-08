import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Les inn tvær tölur af staðalinntaki og
 *          prentar út summuna af staðalúttakið.
 *
 *
 ****************************************************/

public class Add {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Type the first integer: ");
        int x = s.nextInt();
        System.out.print("Type the second integer: ");
        int y = s.nextInt();
        int sum = x + y;
        System.out.println("Their sum is: " + sum);

    }
}
