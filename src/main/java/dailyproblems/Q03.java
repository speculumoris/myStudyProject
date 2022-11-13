package dailyproblems;

public class Q03 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
    public static void main(String[] args) {
        int input =370;
        /*
        int sum=0;
        int girilenSayi=0;
        int inputGris=input;

        while (input>0){
            girilenSayi=input%10;
            sum+=girilenSayi*girilenSayi*girilenSayi;
            input/=10;
        }
        System.out.println(sum);
        if (sum==inputGris){
            System.out.println("sayi armstrong sayidir "+ sum);
        }else System.out.println("sayi armstrong say degildir");
                 */
        girilensayiArmstrong(input);
        girilenSayiyaKadarOlanArmstrong(input);
    }

    public static void girilensayiArmstrong(int input) {
        int sum=0;
        int girilenSayi=0;
        int inputGris=input;

        while (input>0){
            girilenSayi=input%10;
            sum+=girilenSayi*girilenSayi*girilenSayi;
            input/=10;
        }
        System.out.println(sum);
        if (sum==inputGris){
            System.out.println("sayi armstrong sayidir "+ sum);
        }else System.out.println("sayi armstrong sayi degildir"+inputGris);
    }
    private static void girilenSayiyaKadarOlanArmstrong(int input){
        for (int i = 0; i <=input ; i++) {
            girilensayiArmstrong(i);
        }
    }
}
