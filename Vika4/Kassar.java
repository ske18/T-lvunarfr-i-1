/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : Forritið líkir eftir hve margir mannaðir
 *          afgreiðslukassar eru opnir í verslun.
 *          Verslunarstjóri athugar á korters fresti
 *          hvort það þarf að opna kassa vegna of langra
 *          raða eða loka kassa vegna of stuttra raða.
 *          Ef fjöldi kassa fer yfir hámark eða lágmark
 *          er hermuninni lokið.
 ****************************************************/

public class Kassar {
    public static void main(String[] args) {
        int upphafKassar = Integer.parseInt(args[0]);    // upphafsfjöldi kassa
        int maxKassar = Integer.parseInt(args[1]);       // mesti fjöldi kassa
        int fjHermana = Integer.parseInt(args[2]);    // fjöldi hermana

        int fjAthugaOpnun = 0;  // Fjöldi athugana verslunarstjóra
        int lokanir = 0;        // Fjöldi lokana verslunar vegna þess að allir kassar eru opnir

        for (int t = 0; t < fjHermana; t++) {   // hermanir
            int fjKassa = upphafKassar;

            while (fjKassa > 0 && fjKassa < maxKassar) {    // ein opnun verslunar
                fjAthugaOpnun++;
                if (StdRandom.uniform(0.0, 1.0) < 0.5) {
                    fjKassa++; // kössum fjölgar um einn
                } else {
                    fjKassa--;     // kössum fækkar um einn
                }
            }
            if (fjKassa == maxKassar)
                lokanir++;                // lokar versluninni vegna of margra opinna kassa
        }
        System.out.println(
                "Fjöldi lokana " + lokanir + " eftir "

                        + fjHermana + " hermanir");
        System.out.println(
                "Hlutfall lokana er " + Math.round(100.0 * lokanir / fjHermana) + "%");
        System.out.println("Meðalfjöldi athugana í hermun er " + Math
                .round(1.0 * fjAthugaOpnun / fjHermana));
    }
}
