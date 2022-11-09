package project02;

import java.util.Scanner;

class Sugar extends Milk{
    String sugar;

    public Sugar(String kindCofee) {
        super(kindCofee);
        Scanner scan=new Scanner(System.in);
        System.out.println("do you want to sugar?\n" +
                "1.yes\n"+"2.no");
        sugar=scan.next();
        if (sugar.equals("1")){
            System.out.println("How much sugar do you want?");
            int kacSugar= scan.nextInt();
            System.out.println(kacSugar+" sugars are adding");
        }else if (sugar.equals("2")){
            System.out.println("Sugar did not add");
        }
    }
}
