package SchoolProj;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    static Scanner scan=new Scanner(System.in);
    public String okulAd = "Bayindir Koleji";
    public int maxOgrenciSayisi = 3;
    ArrayList<Students> ogrenci = new ArrayList<>();

    public void ogrenciEkleme (String ogrenciAdi, String ogrenciSoyAdi ,int ogrenciYas){
        Students students = new Students(ogrenciAdi, ogrenciSoyAdi, ogrenciYas);
        this.ogrenci.add(students);
        System.out.println(ogrenci);

    }
    public void StudentGiris (){
        String ogrenciAdi = "";
        String ogrenciSoyAdi = "";
        int ogrenciYas = 0;
        int cikis=0;

        do {
            boolean k=true;
            if(ogrenci.size()==maxOgrenciSayisi){
                System.out.println("ogrenci ekleme kapasitesinr ulastiniz\n" +
                        "daha fazla ekleme yapamazsiniz..cikisiniz yapiliyor");
                System.out.println("ogrenci bilgileri: "+ogrenci);
                break;
            }
            System.out.println("lutfen ogrenci bilgilerini giriniz\n" +
                    "cikmak icin 1'e basiniz");

            System.out.print("lutfen ogrenci adini giriniz: ");
            ogrenciAdi = scan.nextLine();

            System.out.print("lutfen ogrenci Soyadini giriniz: ");
            ogrenciSoyAdi = scan.nextLine();

            System.out.print("lutfen ogrenci yasini giriniz: ");
            ogrenciYas = scan.nextInt();

            ogrenciYasi(ogrenciYas);



            ogrenciEkleme(ogrenciAdi,ogrenciSoyAdi,ogrenciYas);


            System.out.print("cikis icin 1 devam etmek icin 2'ye basiniz: ");
            cikis= scan.nextInt();
            scan.nextLine();

            if (cikis==1){
                k=false;
                break;
            }

        }while (true);
    }
    private static void ogrenciYasi(int ogrenciYas) {
        if (ogrenciYas > 15) {
            System.out.println("ogrenci yasi 15'den buyuk olamaz");
            System.out.print("lutfen ogrenci yasini giriniz: ");
            ogrenciYas = scan.nextInt();
        }
    }

}