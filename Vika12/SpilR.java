import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Klasinn lýsir mannsspili með 52 spilum, 4
 *          sortum og 13 gildum.
 *
 *
 *
 ****************************************************/

public class SpilR {
    private String sort;
    private String gildi;

    public SpilR(String s, String g) {
        sort = s;
        gildi = g;
    }
/*
    private String getSort() {
        return sort;
    }

    private String getGildi() {
        return gildi;
    }

       public int compareTo(SpilR o) {
        if (this.sort.equals(o.sort)&&this.gildi.equals(o.gildi)) return 1;
        return 0;
        // return CharSequence.compare(this.gildi, o.gildi);
    } */

    private class GildiComparator implements Comparator<SpilR> {
        private String[] gildi = {"Ás", "Tvistur", "Þristur", "Fjarki", "Fimma",
                "Sexa", "Sjöa", "Átta", "Nía", "Tía", "Gosi", "Drottning", "Kóngur"};

        public int compare(SpilR s1, SpilR s2) {
            for (String s : gildi) {
                if (s1.gildi.equals(s))
                    return 1;
                if (s2.gildi.equals(s))
                    return -1;
            }
            return 0;
        }
    }

    private class SortComparator implements Comparator<SpilR> {
        private String[] sort = {"Hjarta", "Spaði", "Tígull", "Lauf"};

        public int compare(SpilR s1, SpilR s2) {
            for (String s : sort) {
                if (s1.sort.equals(s))
                    return 1;
                if (s2.sort.equals(s))
                    return -1;
            }
            return 0;
        }
    }

    public Comparator<SpilR> getGildiComparator() {
        return new GildiComparator();
    }

    public Comparator<SpilR> getSortComparator() {
        return new SortComparator();
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
        SpilR spil = (SpilR) o;
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
        SpilR a = new SpilR("Hjarta", "Sjöa");
        SpilR b = new SpilR("Hjarta", "Kóngur");
        SpilR c = new SpilR("Tígull", "Ás");
        SpilR d = new SpilR("Lauf", "Átta");
        SpilR e = new SpilR("Spaði", "Sjöa");
        SpilR f = new SpilR("Tígull", "Sjöa");
        SpilR g = new SpilR("Spaði", "Átta");
        SpilR h = new SpilR("Spaði", "Ás");

        SpilR[] spil = {a, b, c, d, e, f, g, h};

        Arrays.sort(spil, spil[0].getSortComparator());
        // raða fylkinu spilin eftir SortComparator() samanburðarfallinu
        Arrays.sort(spil, spil[0].getGildiComparator());
        // raða fylkinu spilin eftir GildiComparator() samanburðarfallinu

        System.out.println(Arrays.toString(spil));
    }
}
