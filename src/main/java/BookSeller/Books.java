package BookSeller;

public class Books {
    public int bookNo ;
    public String bookName;
    public String authorName;
    public double bookPrice;


    public Books(){

    }

    public Books(int kitapNo,String authorName, String bookName,  double bookPrice) {
        this.bookNo = kitapNo;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }


}
