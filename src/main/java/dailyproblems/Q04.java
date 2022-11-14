package dailyproblems;

import java.util.ArrayList;

public class Q04 {
    public static void main(String[] args) {

        //write a program that can multiply each odd number by 2
        ArrayList<Integer> myList=new ArrayList<>();
        ArrayList<Integer> myList1=new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        for (Integer w : myList) {
            if (w%2==0){
                myList1.add(w);
            }else {
                myList1.add(w*2);
            }
        }
        System.out.println(myList1);
    }
}
