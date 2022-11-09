package project02;

import java.util.Scanner;

class Milk extends Cofee{
    String milk;


    public Milk(String kindCofee) {
        super(kindCofee);
        Scanner scan=new Scanner(System.in);
        System.out.println("do you want to some milk?\n" +
                "1.yes\n"+"2.no");
         milk=scan.next();
        if (milk.equals("1")){
            System.out.println("Mılk is adding");
        }else if (milk.equals("2")){
            System.out.println("Milk did not add");
        }else {
            System.out.println("you are wrong side please try again");
        }

    }
}

