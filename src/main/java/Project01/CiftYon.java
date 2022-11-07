package Project01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CiftYon {

    long yas;
    int year;
    int month;
    int day;
    double kmFiyati = 0.10;
    double normalFiyat;


    public void yasGidisliD() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dogum gününü yil,ay,gun olarak giriniz");
        year = scan.nextInt();
        month = scan.nextInt();
        day = scan.nextInt();
        LocalDate now = LocalDate.now();
        LocalDate dg = LocalDate.of(year, month, day);
        yas = ChronoUnit.YEARS.between(dg, now);

        if (yas < 13) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.50)));
            normalFiyat = (normalFiyat - (normalFiyat * 0.20)) * 2;
            System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyat);
        } else if (yas < 24) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.10)));
            normalFiyat = (normalFiyat - (normalFiyat * 0.20)) * 2;
            System.out.println("bilet fiyatiniz  genc indirimi birlikte :" + normalFiyat);
        } else if (yas > 65) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.30)));
            normalFiyat = (normalFiyat - (normalFiyat * 0.20)) * 2;
            System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyat);
        } else {
            normalFiyat = (normalFiyat - (normalFiyat * 0.20)) * 2;
            System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur" + normalFiyat);
        }
    }

}






