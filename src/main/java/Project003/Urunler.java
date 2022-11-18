package Project003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Urunler {
    static Scanner scan = new Scanner(System.in);
    static List<Object> products = new ArrayList<>();


    private int id;
    private String urunIsmi;
    private String uretici;
    private String birim;
    private int miktar;
    private String rafNo;

    public Urunler() {
    }

    public Urunler(int id, String urunIsmi, String uretici, String birim, int miktar, String rafNo) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = miktar;
        this.rafNo = rafNo;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int ıd) {
        this.id = ıd;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {

        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }//.

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birim='" + birim + '\'' +
                ", miktar=" + miktar +
                ", rafNo='" + rafNo + '\''+"\n" +
                '}';
    }
    public static void Cikis() {
        System.out.println("cikisiniz yapilmistir");
    }

    public static void urunListele() {
        scan.nextLine();
        for (Object w : products) {
            System.out.println(w + " ");
        }
    }

    public static void satilanUrun() {

    }

    public static void urunRafaKoy() {


    }

    public  void miktarGuncel1() {

        Urunler prdct = new Urunler();
        System.out.println("miktari gunelleyeceginiz urunun ID numarasini giriniz");
        int girilenId = scan.nextInt();
        if (this.id==girilenId) {
            System.out.println("guncel miktari giriniz");
            int newMiktar = scan.nextInt();
            this.getMiktar();
            this.setMiktar(newMiktar);

        }
    }
    public static void urunTanimlama1() {
        String urunIsmi ;
        String uretici;
        String birim;
        int id;
        scan.nextLine();
        Urunler prdct1 = new Urunler();
        System.out.println("girmek istediginiz urunun id numarasini giriniz");
        id= scan.nextInt();
        System.out.println("lutfen girmek istediginiz urunun adini giriniz");
        scan.nextLine();
        urunIsmi = scan.nextLine();
        System.out.println("lutfen Uretici firmayi giriniz");
        uretici = scan.nextLine();
        System.out.println("lutfen hangi birim oldugunu giriniz");
        birim = scan.nextLine();
        System.out.println("lutfen urun miktarini giriniz");
        int miktr= scan.nextInt();

        scan.nextLine();
        System.out.println("lutfen urun raf no giriniz");
        String raf = scan.nextLine();

        Urunler prdct = new Urunler(id,urunIsmi, uretici, birim, miktr, raf);
        products.add(prdct);

    }

}
