package BookSeller;

import java.util.Scanner;

import static BookSeller.DisplayScreen.*;

public class BookSellerRunner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("lutfen yapmak istediginiz islemi seciniz\n" +
                    "   * 1-kitap ekle\n" +
                    "   * 2-numara ile kitap goruntule\n" +
                    "   * 3-bilgi ile kitap goruntule\n" +
                    "   * 4-numara ile kitap sil\n" +
                    "   * 5-tum kitaplari listele\n" +
                    "   * 6-cikis");

            int num = Integer.parseInt(scan.nextLine());//dummy olmamasi icin
            switch (num) {
                case 1:
                    DisplayScreen.addBook();
                    break;
                case 2:
                    bringBookWithNum();
                    break;
                case 3:
                    bringBookWithInfo();
                    break;
                case 4:
                    deleteBooksWithNum();
                    break;
                case 5:
                    printAllBooks();
                    break;
                case 6:
                    System.out.println("cikisiniz yapiliyor yine bekleriz...");
                    break;
                default:
                    System.out.println("bro duzgun giris yap");
                    break;

            }
        }while (true);
    }
}

