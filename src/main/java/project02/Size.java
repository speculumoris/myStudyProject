package project02;

import java.util.Scanner;

public class Size  extends Sugar{
String size;

    public Size(String kindCofee) {
        super(kindCofee);
        Scanner scan=new Scanner(System.in);
        System.out.println("which size do you want?\n" +
                "1.Venti\n"+"2.Grande\n"+"3.Tall");

        size=scan.next();

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

    }

}

