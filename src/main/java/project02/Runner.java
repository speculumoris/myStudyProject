package project02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("***Cofee Machine***");
        System.out.println("*****************");
        System.out.print("please choose sort of cofee \n" +
                "press 1 for Turk Kahvesi\n" + "press 2 for Fılter Cofee\n" + "press 3 for  Espresso\n"+"press 4 for White Chocolate Mocha\n" +
                "press 5 for Cold Brew\n"+"press 6 for exit \n" +
                "please choose :");
        String choice=scan.next();


      Size size =new Size(choice);



    }
}
