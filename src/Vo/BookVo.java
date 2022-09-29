package Vo;

public class BookVo {
    private int number;
    private String title;
    private String author;
    private boolean status;

    private String rentalMember; //해당 책 대여중인 고객이름

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

    public String isStatus(boolean status) {
        if (status == true) return "대여가능";
        else return "대여불가. 대여중인 회원 : " + this.rentalMember;
    }

    public String getRentalMember() {
        return rentalMember;
    }

    public void setRentalMember(String rentalMember) {
        this.rentalMember = rentalMember;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return " No." + this.number + ", 제목: " + this.title + ", 저자: " + this.author + ", 대여가능여부: " + isStatus(this.status) + " ";
    }
}
