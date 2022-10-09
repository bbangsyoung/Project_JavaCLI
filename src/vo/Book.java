package vo;

public class Book {
    public boolean book_rental;
    private int book_no;
    private String book_name;
    private String book_writer;
    private boolean book_status;
    //private String rentalMember; //해당 책 대여중인 고객이름


    Book(){} //기본생성자
    
    public Book(int book_no, String book_name, String book_writer) {
        super();
        this.book_no = book_no;
        this.book_name = book_name;
        this.book_writer = book_writer;
    }

    public Book(int book_no, String book_name, String book_writer, boolean book_rental) {
        super();
        this.book_no = book_no;
        this.book_name = book_name;
        this.book_writer = book_writer;
        this.book_rental = book_rental;
    }

    public Book(int book_no, boolean book_rental) {
        this.book_no = book_no;
        this.book_rental = book_rental;
    }
    public Book(boolean book_rental) {
        this.book_rental = book_rental;
    }

    public boolean isBook_status() {
        return book_status;
    }

    public void setBook_status(boolean book_status) {
        this.book_status = book_status;
    }

    public int getBook_no() {
        return book_no;
    }

    public void setBook_no(int book_no) {
        this.book_no = book_no;
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

    public boolean isBook_rental() {
        return book_rental;
    }

    public void setBook_rental(boolean book_rental) {
        this.book_rental = book_rental;
    }

    public String toString() {
        return " No." + book_no + "  " + book_name + "  " + book_writer;
    }
    public String toString_rental() {
        if(book_rental) return "대여불가";
        else return  "대여가능";
    }

    public boolean book_rental(Book rentalBook) {
        return book_rental;
    }
}
