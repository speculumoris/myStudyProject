package project01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UcusProjesi {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bilgilerinizi giriniz :");
        System.out.println("Isim-Soyisim");
        String adSoyad = scan.nextLine();
        System.out.println("Lutfen Dogum tarihinizi giriniz"+" yil,ay,gun olarak");
        int yil= scan.nextInt();
        int ay= scan.nextInt();
        int gun= scan.nextInt();
        LocalDate doB= LocalDate.of(yil,ay,gun);
        LocalDate doBn=LocalDate.now();
        Long yas= ChronoUnit.YEARS.between(doB,doBn);
        System.out.println("yasiniz :"+yas);

        System.out.println("Gitmek istediginiz sehri seciniz: \n" + "B sehri icin B:\n" + "C sehri icin C:\n" + "D sehri icin D:\n");
        String sehirIsmi = scan.next().toUpperCase();
        System.out.println("Gidis donus bilet secimi icin :\n" +
                "gidis donus bilet almak icin t'ye almak istemiyoesaniz l'ye basiniz");
        String gidisDonus = scan.next().toLowerCase();
        double yolMesafesi = 0.10;
        double normalFiyatB = 500 * yolMesafesi;
        double normalFiyatC = 700 * yolMesafesi;
        double normalFiyatD = 900 * yolMesafesi;



        if (sehirIsmi.equals("B")) {//Rota kontrolü-route control
            tarifeB(yas, gidisDonus,normalFiyatB);

        } else if (sehirIsmi.equals("C")) {
            tarifeC(yas, gidisDonus,normalFiyatC);

        } else if (sehirIsmi.equals("D")) {
            tarifeD(yas, gidisDonus,normalFiyatD);
        }


    }

    public static void tarifeD(Long yas, String gidisDonus, double normalFiyatD) {
        if (gidisDonus.equalsIgnoreCase("t")) {//gidis donus bilet kontrolu
            if (yas < 13) {//12 yasindan kucuk olma kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.50)));
                normalFiyatD=(normalFiyatD-(normalFiyatD*0.20))*2;
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatD);
            } else if (yas < 24) {//12 ve 24 yas arasinda olma kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.10)));
                normalFiyatD=(normalFiyatD-(normalFiyatD*0.20))*2;
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatD);

            } else if (yas >= 65) {//65 yas ve ustu kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.30)));
                normalFiyatD=(normalFiyatD-(normalFiyatD*0.20))*2;
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatD);

            } else {//24 yasi ve 64 yas araligi kontrolu ve gidis donus bilet indirim kontrolu
                normalFiyatD=(normalFiyatD-(normalFiyatD*0.20))*2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur"+normalFiyatD);
            }

        } else {//gidis donus bileti almama kontrolu
            if (yas < 12) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatD);
            } else if (yas < 24) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatD);
            } else if (yas > 65) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatD);
            } else {
                System.out.println("herhangi indiriminiz yoktur"+normalFiyatD);
            }
        }
    }


    public static void tarifeC(Long yas, String gidisDonus, double normalFiyatC) {
        if (gidisDonus.equalsIgnoreCase("t")) {
            if (yas < 12) {
                normalFiyatC = (normalFiyatC - (normalFiyatC * (0.50)));
                normalFiyatC=(normalFiyatC-(normalFiyatC*0.20))*2;
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatC);
            } else if (yas < 24) {
                normalFiyatC = (normalFiyatC - (normalFiyatC * (0.10)));
                normalFiyatC=(normalFiyatC-(normalFiyatC*0.20))*2;
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatC);

            } else if (yas > 65) {
                normalFiyatC = (normalFiyatC - (normalFiyatC * (0.30)) );
                normalFiyatC=(normalFiyatC-(normalFiyatC*0.20))*2;
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatC);

            } else {
                normalFiyatC=(normalFiyatC-(normalFiyatC*0.20))*2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur"+normalFiyatC);
            }

        } else {
            if (yas < 12) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatC);
            } else if (yas < 24) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatC);
            } else if (yas > 65) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatC);
            } else {
                System.out.println("herhangi indiriminiz yoktur"+normalFiyatC);
            }
        }
    }



    public static void tarifeB(Long yas, String gidisDonus, double normalFiyatB) {

        if (gidisDonus.equalsIgnoreCase("t")) {
            if (yas < 12) {
                normalFiyatB = (normalFiyatB - (normalFiyatB * (0.50)));
                normalFiyatB=(normalFiyatB-(normalFiyatB*0.20))*2;
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatB);
            } else if (yas < 24) {
                normalFiyatB = normalFiyatB - ((normalFiyatB * (0.10)));
                normalFiyatB=(normalFiyatB-(normalFiyatB*0.20))*2;
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatB);

            } else if (yas > 65) {
                normalFiyatB = normalFiyatB - ((normalFiyatB * (0.30)));
                normalFiyatB=(normalFiyatB-(normalFiyatB*0.20))*2;
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatB);

            } else {
                normalFiyatB=(normalFiyatB-(normalFiyatB*0.20))*2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur"+normalFiyatB);            }

        } else {
            if (yas < 12) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatB);
            } else if (yas < 24) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatB);
            } else if (yas > 65) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatB);
            } else {
                System.out.println("herhangi indiriminiz yoktur"+normalFiyatB);
            }
        }
    }

}

