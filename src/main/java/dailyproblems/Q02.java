package dailyproblems;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    //verilen bir tam syai dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilarin
//toplamini bulunuz

    //input={10,13,56,20,40,60,56,32}
//output=13+56+20+40
    public static void main(String[] args) {


        int arr[] = {10, 13, 56, 20, 40, 60, 56, 32};
        List<Integer> list=new ArrayList<>();
        int max = arr[0];
        int min1 = arr[0];
        int sum=0;
        for (int w:arr){
            max=Math.max(max,w);
            min1=Math.min(min1,w);
        }

        for (int w:arr) {
            if (w==max||w==min1){
                continue;
            }
            if (!list.contains(w)){
                list.add(w);
            }
        }
        for (Integer a:list) {
            sum+=a;
        }
        System.out.println(list);
        System.out.println(sum);
    }
}
