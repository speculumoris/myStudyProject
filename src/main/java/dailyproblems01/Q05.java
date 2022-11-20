package dailyproblems01;

public class Q05 {
    //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
    // input : "m", "e", "r", "v", "e";
    // output : merve
    static   String a;
    public static void main(String[] args) {
       concat("m", "e", "r", "v", "e");
    }
    public static void concat(String...input){
        a="";
        for (String w:input) {
            a=a+w;
        }
        System.out.print(a);
    }
}
