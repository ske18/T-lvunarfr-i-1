/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Inniheldur tvö orð og sæti í hvoru þeirra
 *          sem hafa sameiginlegan staf.
 *
 *
 *
 ****************************************************/

public class TvoOrd {
    private String ord1;
    private int saeti1;


    private String ord2;
    private int saeti2;

    public TvoOrd(String s1, int i1, String s2, int i2) {
        ord1 = s1;
        saeti1 = i1;
        ord2 = s2;
        saeti2 = i2;
    }

    // getterar
    public String getOrd1() {
        return ord1;
    }

    public int getSaeti1() {
        return saeti1;
    }

    public String getOrd2() {
        return ord2;
    }

    public int getSaeti2() {
        return saeti2;
    }

    public String toString() {
        return "TvoOrd{" +
                "ord1='" + ord1 + '\'' +
                ", saeti1=" + saeti1 +
                ", ord2='" + ord2 + '\'' +
                ", saeti2=" + saeti2 +
                '}';
    }

    public static void main(String[] args) {

    }
}
