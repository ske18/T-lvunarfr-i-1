/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Styring implements StyringSkil {
    private boolean kveikt;

    public void kveikja() {
        kveikt = true;
    }

    public void slokkva() {
        kveikt = false;
    }

    public boolean erKveikt() {
        return kveikt;
    }

    public static void main(String[] args) {
        Styring s = new Styring();
        s.kveikja();
        System.out.println(s.erKveikt());
        s.slokkva();
        System.out.println(s.erKveikt());
    }
}
