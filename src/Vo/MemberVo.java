package Vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberVo {
    private String id;
    private String pw;
    private String name;
    private String rentalBook;  //해당 회원이 대여중인 책

    Scanner scan = new Scanner(System.in);

    List<MemberVo> memberList = new ArrayList<MemberVo>();



    public MemberVo() { } //기본생성자

    //회원등록
    public MemberVo(String id, String pw, String name, String bookrental) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRentalBook() {
        return rentalBook;
    }

    public void setRentalBook(String rentalBook) {
        this.rentalBook = rentalBook;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", 이름: " + this.name + ", 대여목록: ";
    }




}
