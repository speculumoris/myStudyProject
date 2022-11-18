package dailyproblems01;

import java.util.HashMap;

public class Q03 {
    public static void main(String[] args) {
        //Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
        // "I like to move it, move it." ==> I=1, like=1, to=1, move=2, it=2
        String kelime="I like to move it, move it.";
        kelime=kelime.replaceAll("\\p{Punct}","");
        String arr[]=kelime.split(" ");

        HashMap<String,Integer>gorunum=new HashMap<>();
        for (String w:arr) {
            Integer gorunumSayisi= gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        } System.out.println(gorunum);
    }
}
