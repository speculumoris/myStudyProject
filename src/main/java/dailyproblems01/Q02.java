package dailyproblems01;

import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {


        //Bir listteki 4 harften fazla harf iceren isimleri siliniz
        ArrayList<String> isim = new ArrayList<>();
        isim.add("Chris");
        isim.add("Mark");
        isim.add("Tom");
        isim.add("Jeremy");
        isim.add("Hans");
        System.out.println(isim);

        int idx=0;
        for (String w:isim) {
            if (w.length()>4){
                isim.remove(isim.get(idx));
                idx++;
            }
        }
        System.out.println(isim);



        for (int i=0;i<isim.size();i++) {
            if (isim.get(i).length()>4){
                isim.remove(isim.get(i));
            }
        }
        System.out.println(isim);

    }
}
