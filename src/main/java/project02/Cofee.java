package project02;

import java.util.Scanner;

public class Cofee {
    public Cofee(String kindCofee) {
        this.kindCofee = kindCofee;
       while (true){
           Scanner scan=new Scanner(System.in);
           System.out.print("The cofee what you want :");
           if (this.kindCofee.equals("6")){
               System.out.println("your wants has ended");
               break;
           }else if (this.kindCofee.equals("1")){
               System.out.println("preparing Turkish Cofee....");
               break;
           }else if (this.kindCofee.equals("2")) {
               System.out.println("preparing Filter cofee....");
               break;
           }else if (this.kindCofee.equals("3")) {
               System.out.println("preparing Espresso....");
               break;
           }else if (this.kindCofee.equals("4")) {
               System.out.println("preparing White Chocolate Mocha ....");
               break;
           }else if (this.kindCofee.equals("5")) {
               System.out.println("preparing Cold Brew....");
               break;
           }else {
               System.out.println("you are wrong side please try again");
               break;
           }
       }
    }

    public String kindCofee;


}
