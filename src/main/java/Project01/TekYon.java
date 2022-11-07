package Project01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TekYon extends CiftYon {
    public void yasGidis() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dogum gününü yil,ay,gun olarak giriniz");
        year= scan.nextInt();
        month= scan.nextInt();
        day= scan.nextInt();
        LocalDate now = LocalDate.now();
        LocalDate dg = LocalDate.of(year, month, day);
        yas = ChronoUnit.YEARS.between(dg, now);
        if (yas < 13) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.50)));
            System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyat);
        } else if (yas < 24) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.10)));
            System.out.println("bilet fiyatiniz  genc indirimi birlikte :" + normalFiyat);
        } else if (yas > 65) {
            normalFiyat = (normalFiyat - (normalFiyat * (0.30)));
            System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyat);
        } else {
            System.out.println("Herhangi indiriminiz yoktur" + normalFiyat);
        }

    }
}
