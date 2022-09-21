import java.util.ArrayList;

public class Book {
    protected int number;
    protected String title;
    protected String author;

    public Book() { //생성자 초기화

    }

    public Book(int number, String title, String author) {
        this.number = number;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "No." + number + ", 제목: " + title + ", 저자: " + author;
        }

}
