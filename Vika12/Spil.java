import java.util.Objects;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasi sem lýsir mannspili
 *
 *
 *****************************************************************************/

public class Spil {

    private String sort;
    private String gildi;

    public Spil(String s, String g) {
        sort = s;
        gildi = g;
    }

    /**
     * Skilar true ef spilið o hefur sömu sort og gildi og hluturinn
     *
     * @param o hlutur af klasanum Spil
     * @return true ef spilið o er jafnt og hluturinn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spil spil = (Spil) o;
        return Objects.equals(sort, spil.sort) && Objects.equals(gildi, spil.gildi);
    }

    public int hashCode() {
        return Objects.hash(sort, gildi);
    }

    public String toString() {
        return "Spil{" +
                "sort='" + sort + '\'' +
                ", gildi='" + gildi + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
