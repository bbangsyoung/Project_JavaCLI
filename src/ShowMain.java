import java.util.ArrayList;
import java.util.Scanner;

public class MainPrint {

    void main_Menu(){ // 처음 메인메뉴
        System.out.println("====도서관리 프로그램====");
        System.out.println("1. 도서조회\n" +
                "2. 도서대여/반납\n" +
                "3. 회원등록\n" +
                "4. 관리자모드");
        System.out.println("======================");
        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요 >>");
        int u_menu = scan.nextInt();

        if (u_menu == 1) {



        } else {
            System.out.println("아직구현중이야");

        }

    }

}
