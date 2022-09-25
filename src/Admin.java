import java.util.Scanner;

public class Admin {
    Scanner scan = new Scanner(System.in);

    private String adId = "admin";
    private int adPw = 1234;

    void login() {
        System.out.println("관리자 모드로 진입합니다====");

        while (true) {
            System.out.println("관리자 아이디를 입력해주세요 : ");
            String u_inputId = scan.next();
            System.out.println("패스워드를 입력해주세요 : ");
            int u_inputPw = scan.nextInt();

            if (u_inputId.equals(adId) && u_inputPw == adPw) userManag();
            else System.out.println("로그인실패. 다시 시도해주세요.");
        }
    }

    void userManag() {
        System.out.println("로그인성공");
        while (true) {
            System.out.println("1. 회원관리");
            System.out.println("2. 도서관리");
            System.out.println("메뉴를 선택해주세요 >>");
            int a_input = scan.nextInt();
            if (a_input == 1) insertUser();

        }
    }

    void insertUser() { //회원관리
        System.out.println("회원관리 메뉴입니다.");
        System.out.println("1. 전체회원 확인");
        System.out.println("2. 회원 목록 수정");
        System.out.println("3. 회원 탈퇴");
    }




}
