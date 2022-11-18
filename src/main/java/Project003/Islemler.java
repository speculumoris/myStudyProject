package Project003;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Project003.Urunler.*;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer,Urunler> urunler =new HashMap<>();
    static int id=1000;

    public static void girisEkrani1() {
        System.out.println("lutfen yapacaginiz islemi seciniz\n" +
                "urun tanimlamak icin 1'i\n" +
                "urun guncellemek icin 2'yi\n" +
                "urun rafi guncellemek icin 3'u\n" +
                "urun satisi icin 4'ü\n" +
                "urun alimi icin 5'i \n" +
                "urun listelemek icin 6'i \n" +
                "sistemden cikmak icin 7'i tuslayiniz");

        int giris = scan.nextInt();
        switch (giris) {
            case 1:
                urunTanimlama();
                girisEkrani1();
                break;
            case 2:
                miktarGuncel();
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
                alinanUrun1();
                girisEkrani1();
                break;
            case 6:
                urunListele();
                girisEkrani1();
                break;
            case 7:
                Cikis();
                break;
            default:
                System.out.println("duzgun sayi gir la");
                break;

        }
    }

        private static void alinanUrun1() {
            System.out.println("alinan urunun id numarasini giriniz");
            int idNo= scan.nextInt();
            if (urunler.containsKey(idNo)){
                System.out.println("alinan urun miktarini giriniz");
                int alinanUrun= scan.nextInt();
                System.out.println("Urun miktari degismistir Urun Miktari: " +urunler.get(idNo).getRafNo());
            }else System.out.println("Urun envanterde yoktur");
        }

        public static void Cikis() {
            System.out.println("cikisiniz yapilmistir");
        }

        public static void urunListele() {
            System.out.println("**********Urun Envanter Listesi***********");
            System.out.println(urunler);


        }

        public static void satilanUrun() {
            System.out.println("satilan urunun id numarasini giriniz");
            int idNo= scan.nextInt();
            if (urunler.containsKey(idNo)){
                System.out.println("satilan urun miktarini giriniz");
                int satilanUrun= scan.nextInt();
                urunler.get(idNo).setMiktar(urunler.get(idNo).getMiktar()-satilanUrun);
                System.out.println("Urun miktari degismistir Urun Miktari: " +urunler.get(idNo).getMiktar());
            }else System.out.println("Urun envanterde yoktur");
        }

        public static void urunRafaKoy() {
            System.out.println("rafini girmek istediginiz urunun idno'yu giriniz");
            int idNo= scan.nextInt();scan.nextLine();
            if (urunler.containsKey(idNo)){
                System.out.println("urunu hangi rafa koyacaginizi yaziniz");
                String rafNoYeni= scan.nextLine();
                urunler.get(idNo).setRafNo(rafNoYeni);
                System.out.println("Urun Raf numarasi degismistir Urun RafNo: " +urunler.get(idNo).getRafNo());
            }else System.out.println("Urun envanterde yoktur");


        }



    private static void miktarGuncel() {
        System.out.println("Guncelleyeceginiz urunun id no'sunu giriniz");
        int idNo = scan.nextInt();
        if (urunler.containsKey(idNo)) {
            System.out.println("urunun yeni miktarini giriniz");
            int yeniMiktar = scan.nextInt();
            urunler.get(idNo).setMiktar(yeniMiktar);
            System.out.println("Urun miktari degismistir Urun Miktari: " + urunler.get(idNo).getRafNo());
        } else {
            System.out.println("Urun envanterde yoktur");
        }
    }

    private static void urunTanimlama() {
        System.out.println("Lutfen urun bilgilerini sirasiyla giriniz");

        System.out.println("Lutfen urun adini giriniz");
        String urunIsmi = scan.nextLine();scan.nextLine();

        System.out.println("Lutfen uretici bilgisini giriniz");
        String uretici = scan.nextLine();

        System.out.println("lutfen birimini giriniz\n" +
                "Kg,Lt,Cuval,Tonaj");
        String birim = scan.nextLine();

        System.out.println("Lutfen miktarini giriniz");
        int miktar = scan.nextInt();
        scan.nextLine();

        System.out.println("lutfen urunun rafini giriniz");
        String rafNo = scan.nextLine();scan.nextLine();

        Urunler products = new Urunler(urunIsmi, uretici, birim, miktar, rafNo);
        urunler.put(id, products);
        id++;
    }


}

