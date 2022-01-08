/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Fallið annarhvor prentar út annan hvern staf
 *          í gefinni runu af tölum.
 *
 *
 ****************************************************/

public class Annarhvor {

    /**
     * fallið tekur inn streng og prentar út annan hvern staf í honum.
     *
     * @param s strengur.
     * @return annar hver stafur í strengnum.
     */
    public static String annarhvor(String s) {
        StringBuilder d = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char a = s.charAt(i);
            d.append(String.valueOf(a));

        }
        return d.toString();
    }

    public static void main(String[] args) {
        System.out.println(annarhvor("abcdefg"));
        System.out.println(annarhvor("ébgbebrbbbebsbt"));
        System.out.println(annarhvor("þxúxsxtxexnxdxuxrxþxixgxvxexl"));
        System.out.println(annarhvor("naaanaaanaaanaaanaaanaaanaaanaaa"));
        System.out.println(annarhvor("bkaktkmkakn"));
    }
}
