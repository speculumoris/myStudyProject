package Project003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Urunler {


    private String urunIsmi;
    private String uretici;
    private String birim;
    private int miktar;
    private String rafNo;

    public Urunler() {
    }

    public Urunler(String urunIsmi, String uretici, String birim, int miktar, String rafNo) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = miktar;
        this.rafNo = rafNo;

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
    }

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
}
