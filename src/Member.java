import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String bookrental;

    Scanner scan = new Scanner(System.in);

    List<Member> memberList = new ArrayList<Member>();

    public Member() { } //기본생성자

    //회원등록
    public Member(String id, String pw, String name, String bookrental) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.bookrental = bookrental;
    }

    public void memberadd() {

        Member member = new Member();
        System.out.println("회원등록을 시작합니다.");

        System.out.println("등록할 계정입력");
        member.setId(scan.nextLine());

        System.out.println("패스워드 입력");
        member.setPw(scan.nextLine());
        member.setbookrental("대여목록 없음");


        System.out.println("----------------------------");
        System.out.println(member.getId() + "," + member.getPw());
        System.out.println("----------------------------");
        System.out.println("위 내용이 맞습니까? 맞으면 1, 틀릴 시 2");
        int select = scan.nextInt();
        if (select == 1) {
            memberList.add(member);
            System.out.println("회원등록을 완료하였습니다.");
        } else if (select == 2)
            System.out.println("회원등록을 실패하였습니다.");

        Book book = new Book();
        book.mainMenu();

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

    @Override
    public String toString() {
        return "id: " + id + "회원명: " + name + "연락처: " + bookrental;
    }




}
