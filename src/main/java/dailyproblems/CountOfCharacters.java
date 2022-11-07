package dailyproblems;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfCharacters {
    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a word or sentence");
        String str=scan.nextLine();
        String arr[]=str.split("");
        Arrays.sort(arr);
        int counter=0;


        for (int j = 1; j < arr.length; j++) {
            if (arr[j-1].equalsIgnoreCase(arr[j])){
                counter++;
            }else {
                System.out.println(arr[j-1]+" sayisi :"+(counter+1));
                counter=0;
            }
            if (arr.length-1==j){
                System.out.println(arr[j]+" sayisi :"+(counter+1));
            }
        }









    }
}
