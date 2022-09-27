package VO;

public class MemberVo {
    private String id;
    private String pw;
    private String name;
    private String bookrental;

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

    public String getBookrental() {
        return bookrental;
    }

    public void setBookrental(String bookrental) {
        this.bookrental = bookrental;
    }

    @Override
    public String toString() {
        return "id: " + id + "회원명: " + name + "연락처: " + bookrental;
    }
}
