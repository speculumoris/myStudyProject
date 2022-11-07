package dailyproblems;

public class Day01 {
    public static void main(String[] args) {
        /*
                {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
             *  Array de $ varsa 3.2 ile carp
             *  Array de £ varsa 4.2 ile carp
             *  elemanlarin toplamini  consola yazdir. sonuc = 374.6

        */
        String arr[][]={{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};

            double symbol=1;
            double multiply=0;
            int count =0;
        for (String[] w:arr) {//We created 2 each loop because we are looking each element of the Array ==> 1.loop

            for (String s:w) {//==> 2.loop

                if (s.contains("$")){// we checked that element which has symbol symbol
                    s=s.replace("$","");//for multiply,removed symbols to double
                    symbol=Double.parseDouble(s)*3.2;//each element which has dollar symbol multiplied by 3.2 and symbol's new value happened
                    multiply+=symbol;//and we add the multiply variable;
                    count++;
                    System.out.println("total for "+count+" "+multiply);
                } else if (s.contains("£")) {
                    s=s.replace("£","");
                    symbol=Double.parseDouble(s)*4.2;
                    multiply+=symbol;
                    count++;
                    System.out.println("total for "+count+" "+multiply);
                }
            }

        }
        System.out.println("total for sum :"+multiply);
    }
}
