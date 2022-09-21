import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Book book = new Book(123,"제목","저자");
        System.out.println(book);

        Scanner scan = new Scanner(System.in);
        boolean cho = true;

        while(cho) {
        System.out.println("====도서관리 프로그램====");
        System.out.println("1. 도서조회\n" +
                            "2. 도서대여/반납\n" +
                            "3. 회원등록\n" +
                            "4. 관리자모드");
        System.out.println("======================");

        int u_cho = scan.nextInt();
            if (u_cho == 1) {
                System.out.println("도서조회방법 선택");
                System.out.println("1. 모든 도서보기");
                System.out.println("2. 책 번호로 찾기");
                System.out.println("3. 제목으로 찾기");
                System.out.println("4. 저자로 찾기");
                break;
            } else if (u_cho == 2) {
                System.out.println("도서 대여/반납 메뉴====");
                System.out.println("1. 도서대여");
                System.out.println("2. 도서반납");
                break;
            } else if (u_cho == 3) {
                System.out.println("회원등록 메뉴====");
                System.out.println("1) 등록할 id 입력 : ");
                System.out.println("2) 패스워드 입력 : ");
                System.out.println("3) 회원이름 입력 : ");
                System.out.println("4) 연락처 입력 : ");
                break;
            } else if (u_cho == 4) {
                System.out.println("관리자 모드로 진입합니다====");
                System.out.println("관리자 아이디를 입력해주세요 : ");
                System.out.println("패스워드를 입력해주세요 : ");
                break;
            } else System.out.println("잘못입력하셨습니다. 처음부터 다시하세요!");
        }







    }
}