/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið inniheldur fall sem tekur inn þrjár
 *          heiltölur og skilar true ef  ein af tölunum
 *          er margfeldi hinna tveggja, annars skilar
 *          það false.
 ****************************************************/

public class Summa {
    public static boolean summaTveir(int a, int b, int c) {
        return (a == (b + c) || b == (a + c) || c == (a + b));
    }

    public static void main(String[] args) {
        System.out.println(summaTveir(3, 1, 2)); // true
        System.out.println(summaTveir(1, 2, 3)); // true
        System.out.println(summaTveir(2, 3, 1)); // true
        System.out.println(summaTveir(1, 1, 1)); // false
    }
}
