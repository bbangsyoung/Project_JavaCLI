import java.util.Scanner;
import static java.lang.System.out;

public class PrintScan {

    Scanner scan = new Scanner(System.in);
    boolean roof = true;

    //문자형 입출력
    String getString(String data) {
        out.print(data);
        return scan.nextLine();
    }

    //숫자형 입출력
    int getInt(String data) {
        out.print(data);
        return scan.nextInt();
    }

    //단순문자 출력 메소드
    String print(String pData) {
        out.print(pData);
        return pData;
    }

    //메뉴 출력용 메소드
    String mainMenu() {
        //return print("――――――――――――――――――――\n [ 1. 도서관리  ]  [ 2. 회원관리  ]\n――――――――――――――――――――");
        return print("1도서조회    2도서대여반납    3회원등록    5도서수정    6도서삭제   7도서추가   ");
    }

    String mainMenu(int menu) {
            //if (menu == 1) return print("［ 1：대여&반납  ］［ 2：도서조회  ］［ 3：도서등록  ］［ 4：도서수정  ］［ 5：도서삭제  ］［ 0：종료 ］");
            if (menu == 1) return print("1전체도서조회  2책번호로 조회");
            else if (menu == 2) return print(" ［ 1：전체회원조회 ］［ 2：회원등록 ］［ 3：회원목록수정 ］［ 4：회원탈퇴 ］［ 0：종료 ］");
            else if (menu == 3) return print(" ［ 1：대여&반납 ］［ 2：도서조회 ］［ 3：도서등록 ］［ 4：도서수정 ］［ 5：도서삭제 ］");
            else if (menu == 4) return print(" ［ 1：대여 ］［ 2：반납 ］");
            else return print("잘못 누르셨습니다. 다시 눌러주세요.");
    }

    String subMenu(int menu) {
        if (menu == 1) return print("［ 1：대여  ］［ 2：반납 ］");
        else if (menu == 2) return print(" ［ 1：전체도서조회  ］［ 2：책번호로 조회 ］");
        else return print("잘못 누르셨습니다. 다시 눌러주세요.");
    }


}






