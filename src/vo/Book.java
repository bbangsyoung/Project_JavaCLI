package vo;

public class Book {
    private String book_number;
    private String book_name;
    private String book_writer;
    //private boolean status;
    //private String rentalMember; //해당 책 대여중인 고객이름

    public Book(String book_number, String book_name, String book_writer) {
        super();
        this.book_number = book_number;
        this.book_name = book_name;
        this.book_writer = book_writer;
    }


    public String getBook_number() {
        return book_number;
    }

    public void setBook_number(String book_number) {
        this.book_number = book_number;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_writer() {
        return book_writer;
    }

    public void setBook_writer(String book_writer) {
        this.book_writer = book_writer;
    }

    public String toString() {
        return " No." + book_number + ", 제목: " + book_name + ", 저자: " + book_writer;
    }
}
