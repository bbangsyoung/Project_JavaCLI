package Vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberVo {
    private String id;
    private String pw;
    private String name;
    private String bookrental;

    private String bookrental_list;
    Scanner scan = new Scanner(System.in);

    List<MemberVo> memberList = new ArrayList<MemberVo>();


    public MemberVo() { } //기본생성자

    //회원등록
    public MemberVo(String id, String pw, String name, String bookrental) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.bookrental = bookrental;
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

    public String getbookrental() {
        return bookrental;
    }

    public void setbookrental(String bookrental) {
        this.bookrental = bookrental;
    }

    public String getBookrental() {
        return bookrental;
    }

    public String getBookrental_list() {
        return bookrental_list;
    }

    public void setBookrental_list(String bookrental_list) {
        this.bookrental_list = bookrental_list;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "이름: " + this.name + "대여목록: " + bookrental_list;
    }




}
