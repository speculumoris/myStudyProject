package project02;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class CofeeMachine {
/*
        1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
        2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
           Örn:
          Hangi Kahveyi İstersiniz?
          1.Türk kahvesi
          2.Filtre Kahve
 */
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("*****************");
    System.out.println("***Cofee Machine***");
    System.out.println("*****************");
    System.out.println("please choose sort of cofee \n" +
            "press 1 for Turk Kahvesi\n" + "press 2 for Fılter Cofee\n" + "press 3 for  Espresso\n"+"press 4 for White Chocolate Mocha\n" +
            "press 5 for Cold Brew\n"+"press 6 for exit ");
    String hangiKahve="";

    while (true){
        System.out.print("please choose to what you drink :");
        hangiKahve=scan.nextLine();
        if (hangiKahve.equals("6")){
            System.out.println("your wants has ended");
            break;
        } else if (hangiKahve.equals("1")) {
            System.out.println("preparing Turkish Cofee....");
        }else if (hangiKahve.equals("2")) {
            System.out.println("preparing Filter cofee....");
        }else if (hangiKahve.equals("3")) {
            System.out.println("preparing Espresso....");
        }else if (hangiKahve.equals("4")) {
            System.out.println("preparing White Chocolate Mocha ....");
        }else if (hangiKahve.equals("1")) {
            System.out.println("preparing Cold Brew....");
        }else {
            System.out.println("you are wrong side please try again");
            break;
        }

        System.out.println("*****************");
        System.out.println();

        System.out.println("do you want to some milk?\n" +
                "1.yes\n"+"2.no");
        String milk=scan.next();
        if (milk.equals("1")){
            System.out.println("Mılk is adding");
        }else if (milk.equals("2")){
            System.out.println("Milk did not add");
        }else {
            System.out.println("you are wrong side please try again");
            break;
        }

        System.out.println("*****************");
        System.out.println();

        System.out.println("do you want to sugar?\n" +
                "1.yes\n"+"2.no");
        String sugar=scan.next();
        if (sugar.equals("1")){
            System.out.println("How much sugar do you want?");
            int kacSugar= scan.nextInt();
            System.out.println(kacSugar+" sugars are adding");
        }else if (sugar.equals("2")){
            System.out.println("Sugar did not add");
        }

        System.out.println("*****************");
        System.out.println();

        System.out.println("which size do you want?\n" +
                "1.Venti\n"+"2.Grande\n"+"3.Tall");

        String size=scan.next();

        if (size.equals("1")){
            System.out.println("your cofee size is Venti");
        } else if (size.equals("2")) {
            System.out.println("your cofee size is Grande" );
        }else if (size.equals("3")) {
            System.out.println("your cofee size is Tall");
        }
        System.out.println();


        System.out.println("Your cofee is ready\n" +
                "Enjoy");
        break;
    }

}
}
