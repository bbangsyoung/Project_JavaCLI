package vo;

public class Member {
    private int member_no;
    private String member_name;
    private String member_phone;
    private String book_rental_list;


    Member(){} //기본생성자

    public Member(int member_no, String member_name, String member_phone) {
        super();
        this.member_no = member_no;
        this.member_name = member_name;
        this.member_phone = member_phone;
    }

    public Member(int member_no, String member_name, String member_phone, String book_rental_list) {
        super();
        this.member_no = member_no;
        this.member_name = member_name;
        this.member_phone = member_phone;
        this.book_rental_list = book_rental_list;
    }

    public int getMember_no() {
        return member_no;
    }

    public void setMember_no(int member_no) {
        this.member_no = member_no;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getBook_rental_list() {
        return book_rental_list;
    }

    public void setBook_rental_list(String book_rental_list) {
        this.book_rental_list = book_rental_list;
    }

    public String toString() {

        return member_no + "  " + member_name + "  " + member_phone + book_rental_list;}


}
