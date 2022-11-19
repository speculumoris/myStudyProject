package patterns;

public class PatternsRunner {

    public static void main(String[] args) {
        double cemberAlan=Cember.alan(10);
        System.out.println("cemberAlan = " + cemberAlan);

        double cemberCevre=Cember.cevre(10);
        System.out.println("cemberCevre = " + cemberCevre);

        double dikdortgenAlan=Dikdortgen.dikdortgenAlan(10,15);
        System.out.println("dikdortgenAlan = " + dikdortgenAlan);

        double dikdortgenCevre=Dikdortgen.dikdortgenCevre(10,20);
        System.out.println("dikdortgenCevre = " + dikdortgenCevre);

        double ucgenAlan=Ucgen.ucgenAlani(10,10);
        System.out.println("ucgenAlan = " + ucgenAlan);

        double ucgenCevre=Ucgen.ucgenCevre(10,15,20);
        System.out.println("ucgenCevre = " + ucgenCevre);

        double kareAlan=DikdortgenKare.kareAlan(10,20);
        System.out.println("kareAlan = " + kareAlan);

        double kareCevre=DikdortgenKare.kareCevre(10,20);
        System.out.println("kareCevre = " + kareCevre);
    }
}
