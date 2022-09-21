import java.util.ArrayList;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String phoneNumber;

    public Member(String id, String pw, String name, String phoneNumber) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "id: " + id + "회원명: " + name + "연락처: " + phoneNumber;
    }




}
