/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Aðferðir til að gera krossgátu.
 *
 *
 *
 ****************************************************/

public class Krossgata {
    /**
     * Finnur hvort til er sameiginlegur bókstafur í orðunum s1 og s2
     * og skilar hlut af klasanum TvoOrd sem
     * hefur orðin tvö og sæti sameiginlega bókstafsins.
     * Ef enginn sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param s1 orð
     * @param s2 orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins
     */
    public static TvoOrd samiStafur(String s1, String s2) {
        if (s1.equals(s2)) {
            return null;
        }
        for (int i = 0; i < s2.length(); i++) {
            int num = s1.indexOf(s2.charAt(i));
            if (num != -1) {
                return new TvoOrd(s1, num, s2, i);
            }
        }
        return null;
    }

    /**
     * Finnur tvö mismunandi í fylki af orðum  sem hafa sameiginlegan staf og
     * skilar hlut af klasanum TvoOrd sem inniheldur orðin tvö og
     * sætin með sameiginlega stafnum
     *
     * @param ordK fylki af orðum
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. Ef enginn sameiginlegur stafur finnst
     * þá skilar aðferðin null hlut
     */
    public static TvoOrd finnaOrd(String[] ordK) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = finnaOrd(ordK, ordK[i]);
            if (t != null)
                return t;
        }
        return null;
    }

    /**
     * Finnur fyrsta orð í  fylkinu ordK sem hafa sameiginlegan bókstaf með s
     * Skilar orðunum tveimur með sætum sameiginlega bókstafsins.
     * Ef engin sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param ordK fylki af orðum
     * @param s    orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. skilar null ef enginn sameiginlegur
     */
    public static TvoOrd finnaOrd(String[] ordK, String s) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = samiStafur(ordK[i], s);
            if (t != null)
                return t;
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strengir = {"afmæli", "bál", "bók", "aldur"};
        StdOut.println(finnaOrd(strengir));
    }
}
