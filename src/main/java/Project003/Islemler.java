package Project003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Project003.Urunler.*;

public class Islemler {
    static Scanner scan = new Scanner(System.in);

    public static void girisEkrani1() {
        System.out.println("lutfen yapacaginiz islemi seciniz\n" +
                "urun tanimlamak icin 1'i\n" +
                "urun guncellemek icin 2'yi\n" +
                "urun rafi guncellemek icin 3'u\n" +
                "urun cikisi icin 4'ü\n" +
                "urun listelemek icin 5'i \n" +
                "sistemden cikmak icin 6'i tuslayiniz");
        int giris = scan.nextInt();
        switch (giris) {
            case 1:
                urunTanimlama1();
                girisEkrani1();
                break;
            case 2:
                Urunler uruns=new Urunler();
              uruns.miktarGuncel1();
                girisEkrani1();
                break;
            case 3:
                urunRafaKoy();
                girisEkrani1();
                break;
            case 4:
                satilanUrun();
                girisEkrani1();
                break;
            case 5:
                urunListele();
                girisEkrani1();
                break;
            case 6:
                Cikis();
                break;
        }
    }









}

