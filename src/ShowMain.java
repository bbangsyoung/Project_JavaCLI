import java.util.Scanner;

public class ShowMain {
    void mainMenu(){ // 처음 메인메뉴
        System.out.println("====도서관리 프로그램====");
        System.out.println("1. 도서조회\n" +
                "2. 도서대여/반납\n" +
                "3. 회원등록\n" +
                "4. 관리자모드\n" +
                "0. 프로그램 종료");
        System.out.println("======================");

        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요 >>");
        int u_Input = scan.nextInt();

        switch (u_Input) {
            case 1:
                //lookupBook(); //도서조회
                break;
            case 2:
                //brBook(); //도서대여/반납
                break;
            case 3:
                //insertUser(); //회원등록
                break;
            case 4:
                Admin admin = new Admin(); //관리자모드-로그인
                admin.login();
                break;
            case 0:
                System.out.println("프로그램 종료");
                scan.close();
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                break;
        }

    }

}
