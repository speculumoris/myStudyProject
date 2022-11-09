package dailyproblems;

import java.util.Scanner;

public class CountWord {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        char harf='a';
        int count=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf){
                count++;
            }

        }
        System.out.println(harf+" harfi "+count+" kere kullanilmistir");
    }
}
