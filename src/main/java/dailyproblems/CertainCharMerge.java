package dailyproblems;

import java.util.Scanner;

public class CertainCharMerge {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next();
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.print(kelime.substring(0,1)+(kelime.substring(kelime.length()-1)));
        }
    }


}
