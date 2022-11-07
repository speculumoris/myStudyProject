package Project01;

public class Rota extends GidisDonus{
    char route;

    public Rota(String route){
        super();
        if (route.equalsIgnoreCase("b")){
            normalFiyat = 500 * kmFiyati;
            System.out.println(route+" da indirimsiz fiyat "+normalFiyat);
            gidisDonus();
        }else if (route.equalsIgnoreCase("c")){
            normalFiyat = 700 * kmFiyati;
            System.out.println(route+" da indirimsiz fiyat "+normalFiyat);
            gidisDonus();
        }else if (route.equalsIgnoreCase("d")){
            normalFiyat = 900 * kmFiyati;
            System.out.println(route+" da indirimsiz fiyat "+normalFiyat);
            gidisDonus();

        }else System.out.println("boyle bir rota bulunmamaktadir");
    }
}
