/*
import vo.BookVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController_befor {
    Scanner scan = new Scanner(System.in);
    PrintScan p = new PrintScan();
    BookVo book = new BookVo();
    Book_befor bookbook = new Book_befor();
    Member member = new Member();

    List<BookVo> bookList = new ArrayList<BookVo>();

    int selectNo; //메뉴선택용


    BookController_befor() {} //기본 생성자


    public void showMain() { // 처음 메인메뉴
        p.mainMenu();

        switch (p.getInt("메뉴 입력 >>")) {
            case 1:
                bookbook.lookupBook(); //도서조회
                break;
            case 2:
                bookbook.brBook(); //도서대여/반납
                break;
            case 3://회원등록
                member.memberAdd();
                break;
            case 4:
                Admin admin = new Admin(); //관리자모드-로그인
                admin.adminlogin();
                break;
            case 5: //도서수정
                bookbook.bookModify();
                break;
            case 6: //도서삭제
                bookbook.bookdelete();
                break;
            case 7: //도서추가
                bookbook.bookAdd();
                break;
            case 8: //회원조회
                member.memberLookup();
                break;
            case 0:
                p.print("프로그램 종료");
                scan.close();
            default:
                p.print("잘못 입력하셨습니다. 다시 입력하세요.main");
                break;
        }
    }
}
*/
