package BookSeller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DisplayScreen {
    static Scanner scan = new Scanner(System.in);

    static List<Books> booksList = new ArrayList<>();
    public static int count = 1000;

    public static void printAllBooks() {
        System.out.println("=========================================================");
        System.out.println("kitapno   kitapAdi    YazarAdi    fiyat   ");
        for (Books w : booksList) {
            System.out.printf("%-9d %-11s %-11s %-1s", w.bookNo, w.authorName, w.bookName, String.valueOf(w.bookPrice) + "\n");
        }
    }

    public static void deleteBooksWithNum() {
        boolean sil = true;
        do {
            System.out.println("lutfen silmek istediginiz kitabin numarasini giriniz\n" +
                    "cikmak icin 1'e basiniz");
            int delete = scan.nextInt();
            if (delete == 1) {
                System.out.println("cikisiniz yapiliyor");
                break;
            }
            for (int i = 0; i < booksList.size(); i++) {
                if (delete == booksList.get(i).bookNo) {
                    booksList.remove(booksList.get(i));
                    System.out.println("basariyla silindi");
                    sil = true;
                    break;
                }
            }
        } while (true);
    }

    public static void bringBookWithInfo() {
        boolean varMi = false;
        do {
            System.out.println("hangi bilgiyle kitabi getirmek istiyorsunuz\n" +
                    "yazar adi ise 1'i\n" +
                    "kitap adi ise 2'yi\n" +
                    "cikmak icin 3'e basiniz");
            int info = scan.nextInt();
            if (info == 3) {
                System.out.println("cikisiniz yapiliyor");
                break;
            }
            scan.nextLine();
            if (info == 1) {
                System.out.println("lutfen gormek istediginiz kitabn yazarinin adini giriniz: ");
                String authorNAme = scan.nextLine();
                for (Books author1 : booksList) {
                    if (author1.authorName.equalsIgnoreCase(authorNAme)) {
                        System.out.println("kitap num: " + author1.authorName +
                                ", Yazar ismi: " + author1.authorName + "," +
                                ", Kitap ismi:" + author1.bookName +
                                ", Kitap fiyati:" + author1.bookPrice);
                        varMi = true;
                    }
                }
                if (varMi == false) {
                    System.out.println("bu yazara ait kitap yoktur");
                }


            } else if (info == 2) {
                System.out.println("lutfen gormek istediginiz kitabin adini giriniz: ");
                String bookName = scan.nextLine();
                for (Books book1 : booksList) {
                    if (book1.authorName.equalsIgnoreCase(bookName)) {
                        System.out.println("kitap num: " + book1.authorName +
                                ", Yazar ismi: " + book1.authorName + "," +
                                ", Kitap ismi:" + book1.bookName +
                                ", Kitap fiyati:" + book1.bookPrice);
                        varMi = true;
                    }
                }
                if (!varMi) {
                    System.out.println("bu isimde bir kitap yoktur");
                }

            }
        } while (true);
    }

    public static void bringBookWithNum() {

        boolean varMi = false;
        do {
            System.out.println("lutfen gormek istediginiz kitabin numarasini giriniz: \n" +
                    "cikis icin 2'Ye basiniz");
            int bookNo = scan.nextInt();
            if (bookNo == 2) {
                System.out.println("cikisiniz yapiliyor");
                break;
            }
            for (Books bookno1 : booksList) {
                if (bookNo == bookno1.bookNo) {
                    System.out.println("kitap num: " + bookNo +
                            ", Kitap ismi: " + bookno1.bookName +
                            ", Yazar ismi:" + bookno1.authorName +
                            ", Kitap fiyati:" + bookno1.bookPrice);
                    varMi = true;
                }
            }
            if (!varMi) {
                System.out.println("kitap yoktur");
            }
        } while (true);
    }


    public static List<Books> addBook() {
        boolean flag = true;
        do {

            System.out.println("lutfen girmek istediginiz kitap bilgilerini giriniz\n" +
                    "kitap ekleme kismindan cikmak icin 1'e basiniz");

            String bookName = scan.nextLine();
            if (bookName.equals("1")) {
                flag = false;
                break;
            }
            String yazarAdi = scan.nextLine();
            double bookPrice = scan.nextDouble();
            scan.nextLine();

            Books books = new Books(count, yazarAdi, bookName, bookPrice);
            booksList.add(books);
            System.out.println("kitap eklenmistir");
            count++;
        } while (flag);

        return booksList;
    }
}


