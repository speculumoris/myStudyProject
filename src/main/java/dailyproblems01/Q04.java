package dailyproblems01;

public class Q04 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
        System.out.println(toplam(10, 20, 10, 15));

    }
    public static int toplam(int a,int...b){
        int toplama=0;
        for (int w : b) {
            toplama+=w;
        }
        return toplama*a;
    }
}
