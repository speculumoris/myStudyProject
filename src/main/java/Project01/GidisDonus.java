package Project01;

import java.util.Scanner;

public class GidisDonus extends TekYon{

    int gidisDonus;
    double kmFiyati = 0.10;

    public void gidisDonus(){
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen biletinizin gidis donus mu olacagina karar veriniz");
        gidisDonus= scan.nextInt();
        if (gidisDonus==2){
            System.out.println("cift yonlu bilet aldiniz");
           yasGidisliD();
        }else if (gidisDonus==1){
            System.out.println("tek yonlu bilet aldiniz");
            yasGidis();
        }else System.out.println("hatali giris yapildi");
    }
}
