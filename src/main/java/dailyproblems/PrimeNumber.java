package dailyproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner sca=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=sca.nextInt();
        int count=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                count++;
            }
        }
        if (count>2){
            System.out.println("it is not prime");
        }else System.out.println("it is prime");
    }
}
