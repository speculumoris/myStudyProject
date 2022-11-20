package AtmProject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atm {

    /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin,
         eger herhangi birini yanlis girerse tekrar isteyin.

        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.

        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
         eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */
    static DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    static double bakiye;
    static String kartNo = "1234123412341234";
    static int sifrem = 1234;
    static Scanner scan =new Scanner(System.in);

    public static void giris(){
        System.out.println("lutfen kart numaranizi giriniz");
        String kartNo1= scan.nextLine();
        int kartn1=kartNo1.replace(" ","").length();
        scan.nextLine();
        System.out.println("lutfen sifrenizi giriniz: ");
        int sifre= scan.nextInt();
        if (kartn1 == kartNo.length()||sifre==sifrem){
            System.out.println("kart numaraniz ve sifreniz dogurudur\n" +
                    "ana ekrana yonlendiriliyorsunuz");
            anaEkran();
        }else {
            System.out.println("sifre ve kart numarasi hatalidir tekrar deneyizniz");
            giris();
        }
    }


   public static void anaEkran(){
       System.out.println("Lutfen yapmak istediginiz islemi seciniz\n" +
               "bakiye sorgulamak icin 1'e\n" +
               "para yatirmak icin 2'ye\n" +
               "para cekmek icin 3'e\n" +
               "para göndermek icin 4'e\n" +
               "Bilgileri guncellemek icin 5'e\n" +
               "cikis yapmak icin 6'ya basiniz");
       int giris= scan.nextInt();scan.nextLine();
       switch (giris){
           case 1:
                bakiyeSorgula();
                anaEkran();
                break;
           case 2:
               paraYatir();
                anaEkran();
                break;
           case 3:
                paraCek();
                anaEkran();
                break;
           case 4:
                paraGonder();
                anaEkran();
                break;
           case 5:
               bilgileriGuncelle();
               anaEkran();
               break;
           case 6:
               cikis();
               break;
       }
       
   }

    private static void bakiyeSorgula() {
        System.out.println("hesap bakiyeniz : "+moneyFormat.format(bakiye));
    }

    private static void cikis() {
        System.out.println("cikisiniz yapilmistir tekrar bekleriz :) :)");
    }

    private static void bilgileriGuncelle() {
        System.out.print("telefon numarasi degismek icin 1'i\n" +
                "sifre guncellemek icin 2'yi\n" +
                "kisisel bilgilerinizi kontrol etmek icin 3'e basiniz: ");
        int tus=scan.nextInt();
        System.out.println();
        if (tus==1){
            System.out.println("Telefon numaranizi degismek icin islak imzaya ihtiyac vardir\n" +
                    "en yakin subemizi ziyaret ediniz");
            System.out.println();
        } else if (tus==2) {
            System.out.print("eski sifrenizi giriniz: ");
            int eskiSfirem=sifrem;
            int eskiSifre1= scan.nextInt();
            if (eskiSfirem==eskiSifre1){
                System.out.print("Eski sifre dogru\n" +
                        "lutfen yeni sifrenizi giriniz: ");
                int yeniSifre= scan.nextInt();
                sifrem=yeniSifre;

                System.out.println("Sifreniz guncellenmistir");
            }
        } else if (tus==3) {
            System.out.println("Aile bilgileri degismek icin islak imzaya ihtiyac vardir\n" +
                    "en yakin subemizi ziyaret ediniz");
            System.out.println();

        }else System.out.println("hatali tuslamak yaptiniz");
    }

    private static void paraGonder() {
        System.out.print("gondermek istediginiz hesabin Iban numarasini giriniz: ");
        System.out.println();

        String ibanNo= scan.nextLine();
        System.out.print("gondermek istediginiz miktari giriniz: ");
        System.out.println();
        scan.nextLine();
        double amount= scan.nextDouble();
        if (!ibanNo.startsWith("TR")||ibanNo.length()!=26){
            System.out.print("iban no basinda Tr ile 26 hane olacak sekilde giriniz: ");
            paraGonder();
            System.out.println();
        } else {
            sendMoney(amount,ibanNo);
            checkingBalance();
            System.out.println();
        }
    }
    private static void sendMoney(double amount,String iban){
        List<String>ibanNo=new ArrayList<>();
        ibanNo.add("TR123412341234123412341234");
        ibanNo.add("TR123412341234123412341235");
        ibanNo.add("TR123412341234123412341236");
        ibanNo.add("TR123412341234123412341237");
        ibanNo.add("TR123412341234123412341238");
       if (ibanNo.contains(iban)){
           if (bakiye>=amount){
               bakiye=bakiye-amount;
           }else {
               System.out.println("bakiyeniz istediginiz miktari gondermek icin yetersizdir");
           }
       }else {
           System.out.println("iban no yanlis girildi");
       }
    }

    private static   void paraCek() {
       checkingBalance();
        System.out.print("lutfen cekmek istediginiz miktari giriniz: ");
        double amount= scan.nextDouble();
        if (amount<=0 || amount>bakiye){
            System.out.println("0 ve eksi rakamlar gecersizdir veya bakiyenizdeki paradan fazla cekmek istediniz!!");
            paraCek();
        }else {
            calculationBalanceWithdraa(amount);
            checkingBalance();
        }
    }


    private static void paraYatir() {
       checkingBalance();
        System.out.print("yatirmak istediginiz miktari giriniz: ");
        double amount= scan.nextDouble();
        if (amount>0){
            calculationBalanceDdeposit(amount);
            checkingBalance();
            System.out.println();
        }else {
            System.out.println("0'dan az miktar yatıramazsiniz");
            paraYatir();
            System.out.println();
        }
    }

    public static void checkingBalance(){
        System.out.println("guncel hesap bakiyeniz: "+moneyFormat.format(bakiye));
        System.out.println();
    }
    public static double calculationBalanceDdeposit(double amount){
        bakiye=bakiye+amount;
        return bakiye;
    }
    public static double calculationBalanceWithdraa(double amount){
        bakiye=bakiye-amount;
        return bakiye;
    }
}

