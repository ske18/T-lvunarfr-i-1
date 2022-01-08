/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Printnum {
    public static String printNumber(int n) {
        String number = " " + n;
        if (n == 0)
            return "";
        else if (n == 1) {
            return number;
        } else
            return number + " " + printNumber(n - 1);
    }
// if (n==0) return "";
    // return n + " " + printNumber(n-1);

    public static void main(String[] args) {
        System.out.println(printNumber(3));
        System.out.println(printNumber(0));
        System.out.println(printNumber(1));
    }
}
