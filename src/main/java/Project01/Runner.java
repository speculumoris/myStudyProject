package Project01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen hangi rotada gideceginize karar veriniz \n" +
                "rota B icin B \n" +
                "rota C icin C \n"+ "rota D icin D");
        String route= scan.next();

        Rota rota = new Rota(route);


    }
}
