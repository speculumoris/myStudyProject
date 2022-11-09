package dailyproblems;

import java.util.Scanner;

public class CountCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String sifre="1234Sef";
        int girisHakki=3;
        while (true){
            System.out.println("sifrenizi giriniz");
            String girilenPin=scan.nextLine();
            if (!girilenPin.equals(sifre)){
                girisHakki--;
                System.out.println("sifreniz hatali");
                System.out.println("kalan hakkiniz :"+girisHakki);


            }else {
                System.out.println("girdiginiz sifre dogru");
                System.out.println("sifre onaylandi");
                break;
            }
            if (girisHakki==0){
                System.out.println("giris hakkiniz bitmistir");
                break;
            }
        }
    }
}
