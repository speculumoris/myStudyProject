package BookSeller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DisplayScreen {
    static Scanner scan=new Scanner(System.in);

    static List<Books>booksList=new ArrayList<>();
    public static int count=1000;
    public static void mainDisplayScreen(){
        System.out.println("lutfen yapmak istediginiz islemi seciniz" +
                "   * 1-kitap ekle\n" +
                "   * 2-numara ile kitap goruntule\n" +
                "   * 3-bilgi ile kitap goruntule\n" +
                "   * 4-numara ile kitap sil\n" +
                "   * 5-tum kitaplari listele\n" +
                "   * 6-cikis");
        int num=Integer.parseInt(scan.nextLine());
        switch (num){
            case 1:
                addBook();
                mainDisplayScreen();
                break;
            case 2:
                bringBookWithNum();
                mainDisplayScreen();
                break;
            case 3:
                bringBookWithInfo();
                mainDisplayScreen();
                break;
            case 4:
                deleteBooksWithNum();
                mainDisplayScreen();
                break;
            case 5:
                printAllBooks();
                mainDisplayScreen();
                break;

        }
    }

    private static void printAllBooks() {
        System.out.println("=========================================================");
        System.out.println("kitap no    Yazar adi    kitap adi     fiyat   ");
        for (Books w:booksList) {
            System.out.printf("%-6d %-9s %-9s %-4d",w.bookNo,w.authorName,w.bookName,w.bookPrice);
        }
    }

    private static void deleteBooksWithNum() {
        boolean sil=false;
        System.out.println("lutfen silmek istediginiz kitabin numarasini giriniz");

        int delete=scan.nextInt();
        for (int i = 0; i <booksList.size() ; i++) {
            if (delete==booksList.get(i).bookNo){
                booksList.remove(booksList.get(i));
                System.out.println("basariyla silindi");
                sil=true;
                break;
            }
        }
    }

    private static void bringBookWithInfo() {
        System.out.println("hangi bilgiyle kitabi getirmek istiyorsunuz\n" +
                "yazar adi ise 1'i\n" +
                "kitap adi ise 2'yi\n");
        int info= scan.nextInt();scan.nextLine();
        boolean varMi=false;
        if (info==1){
            System.out.println("lutfen gormek istediginiz kitabn yazarinin adini giriniz: ");
            String authorNAme=scan.nextLine();
            for (Books author1:booksList) {
                if (author1.authorName.equalsIgnoreCase(authorNAme)) {
                    System.out.println("kitap num: " + author1.authorName +
                            ", Yazar ismi: " + author1.authorName + "," +
                            ", Kitap ismi:" + author1.bookName +
                            ", Kitap fiyati:" + author1.bookPrice);
                    varMi = true;
                }
            }if (varMi==false){
                System.out.println("bu yazara ait kitap yoktur");
            }


        }else if (info==2){
            System.out.println("lutfen gormek istediginiz kitabin adini giriniz: ");
            String bookName=scan.nextLine();
            for (Books book1:booksList) {
                if (book1.authorName.equalsIgnoreCase(bookName)) {
                    System.out.println("kitap num: " + book1.authorName +
                            ", Yazar ismi: " + book1.authorName + "," +
                            ", Kitap ismi:" + book1.bookName +
                            ", Kitap fiyati:" + book1.bookPrice);
                    varMi = true;
                }
            }if (varMi==false){
                System.out.println("bu isimde bir kitap yoktur");
            }

        }

    }

    private static void bringBookWithNum() {
        System.out.println("lutfen gormek istediginiz kitabin numarasini giriniz: ");
        boolean varMi=false;
        int bookNo = scan.nextInt();
        for (Books bookno1 : booksList) {
            if (bookNo == bookno1.bookNo) {
                System.out.println("kitap num: " + bookNo +
                        ", Yazar ismi: " + bookno1.authorName + "," +
                        ", Kitap ismi:" + bookno1.bookName+
                        ", Kitap fiyati:" + bookno1.bookPrice);
                varMi=true;
            }
        }if (varMi==false){
            System.out.println("kitap yoktur");
        }
    }


        private static List<Books> addBook () {
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
                double bookPrice = scan.nextDouble();scan.nextLine();

                Books books = new Books(count, yazarAdi, bookName, bookPrice);
                booksList.add(books);
                System.out.println("kitap eklenmistir");
                count++;
            } while (flag);

            return booksList;
        }
    }


