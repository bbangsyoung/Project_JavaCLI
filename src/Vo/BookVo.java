package Vo;

public class BookVo {
    private int number;
    private String title;
    private String author;
    private boolean status;

    public int getNumber() {return number;}

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return " No." + this.number + ", 제목: " + this.title + ", 저자: " + this.author + ", 대여가능여부: " + this.status + " ";
    }
}
