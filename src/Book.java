import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class Book extends Admin {
    private int number;
    private String title;
    private String author;
    private boolean status;

    Scanner sacn = new Scanner(System.in);
    List<Book> bookList = new ArrayList<Book>();

    public Book() {
    } //생성자 초기화

    //미리 데이터 담아둘 용도
    public Book(int setNumber, String setTitle, String setAuthor, boolean setStatus) {
        this.number = setNumber;
        this.title = setTitle;
        this.author = setAuthor;
        this.status = setStatus;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "\nNo." + this.number + ", 제목: " + this.title + ", 저자: " + this.author + ", 대여가능여부: " + this.status + " ";
    }

    public void mainMenu() { // 처음 메인메뉴


        System.out.println("====도서관리 프로그램====");
        System.out.println("1. 도서조회\n" +
                "2. 도서대여/반납\n" +
                "3. 회원등록\n" +
                "4. 관리자모드\n" +
                "5. 도서수정(임시테스트메뉴)\n" +
                "6. 도서삭제(임시테스트메뉴)\n" +
                "7. 도서등록(임시테스트메뉴)\n" +
                "8. 회원등록(임시테스트메뉴)\n" +
                "0. 프로그램 종료");
        System.out.println("======================");

        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요 >>");
        int u_Input = scan.nextInt();

        switch (u_Input) {
            case 1:
                lookupBook(); //도서조회
                break;
            case 2:
                brBook(); //도서대여/반납
                break;
            case 3:
                //insertUser(); //회원등록
                break;
            case 4:
                Admin admin = new Admin(); //관리자모드-로그인
                admin.adminlogin();
                break;
            case 5: //도서수정
                bookmodify();
                break;
            case 6: //도서삭제
                bookdelete();
                break;
            case 7: //도서추가
                bookadd();
                break;
            case 8: //회원등록
                Member member = new Member();
                member.memberadd();
                break;
            case 0:
                System.out.println("프로그램 종료");
                scan.close();
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                break;
        }
    }

    public void lookupBook() { //도서조회
        System.out.println("도서조회메뉴 =====");
        System.out.println("1. 모든 도서보기");
        System.out.println("2. 책 번호로 찾기");

        Scanner scan = new Scanner(System.in);
        int u_Input = scan.nextInt();

        if (u_Input == 1) { //1.모든 도서보기
            System.out.println("전체 도서 목록");
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getNumber());
                System.out.println(bookList.get(i).getTitle());
                System.out.println(bookList.get(i).getAuthor());
                System.out.println(bookList.get(i).isStatus());
                mainMenu();
            }
        } else if (u_Input == 2) { //2.책 번호로 찾기
            System.out.println("검색하실 책 번호를 입력해주세요 >> ");
            int u_inputs = scan.nextInt();
            for (int i = 0; i < bookList.size(); i++) {
                if (u_inputs == bookList.get(i).getNumber()) {
                    System.out.println(bookList.get(i).getNumber());
                    System.out.println(bookList.get(i).getTitle());
                    System.out.println(bookList.get(i).getAuthor());
                    System.out.println(bookList.get(i).isStatus());
                    break;
                }
            }
        }  else {
            System.out.println("잘못입력하셨습니다. 다시 진행해주세요.");
            lookupBook();
        }
    }


    void bookadd() { //도서등록
        Book book = new Book();
        Scanner scan = new Scanner(System.in);
        System.out.println("책 번호 입력 >>");
        book.setNumber(scan.nextInt());

        scan.nextLine();

        System.out.println("책 제목 입력 >>");
        book.setTitle(scan.nextLine());

        System.out.println("작가 입력 >>");
        book.setAuthor(scan.nextLine());
        book.setStatus(true);

        System.out.println("----------------------------");
        System.out.println("No." + book.getNumber() + ", 제목: " + book.getTitle() + ", 작가: " + book.getAuthor());
        System.out.println("----------------------------");

        System.out.println("위 내용이 맞습니까? 맞으면 1, 틀릴 시 2");
        int select = sacn.nextInt();
        if (select == 1) {
            bookList.add(book);
            System.out.println("도서등록을 완료하였습니다.");
        } else if (select == 2)
            System.out.println("도서등록을 실패하였습니다.");
        mainMenu();
    }

    void bookmodify() {
        System.out.println("수정할 책 번호를 입력해주세요 >> ");
        Scanner scan = new Scanner(System.in);
        int u_inputs = scan.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (u_inputs == bookList.get(i).getNumber()) {
                System.out.print("수정할 책 제목 입력>> ");
                scan.nextLine();
                bookList.get(i).setTitle(scan.nextLine());
                System.out.print("수정할 작가이름 입력 >> ");
                bookList.get(i).setAuthor(scan.nextLine());
                System.out.println("도서수정 완료.");
                System.out.println(bookList);
            } else {
                System.out.println("해당 책정보는 없습니다.");
            }
            mainMenu();
        }
    }

    void bookdelete() {
        System.out.println("삭제할 책 번호를 입력해주세요 >> ");
        int u_inputs = scan.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (u_inputs == bookList.get(i).getNumber()) {
                bookList.remove(i);
                System.out.println("삭제완료");
            } else {
                System.out.println("해당번호가 없어요");
            }
        }
        mainMenu();
    }


    void insertBook() { //도서관리
        Book book = new Book();
        System.out.println("도서관리 메뉴입니다.");
        System.out.println("1. 도서등록");
        System.out.println("2. 도서수정");
        System.out.println("3. 도서삭제");
    }


    void brBook() {
        System.out.println("도서 대여/반납 메뉴입니다.");
        System.out.println("해당 도서 번호를 입력해주세요");
        int u_input = scan.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (u_input == bookList.get(i).getNumber()) {
                boolean rental = bookList.get(i).isStatus();
                if (rental) {
                    System.out.println("대여가 가능합니다. 대여하시겠습니까? 대여1, 취소2");
                    u_input = scan.nextInt();
                    if (u_input == 1) {
                        rental = false;
                        System.out.println("대여가 완료되었습니다.");
                    } else {
                        System.out.println("대여가 취소되었습니다.");
                    }
                } else {
                    System.out.println("해당 책은 현재 대여중입니다. 반납하시려면1 취소2");
                    u_input = scan.nextInt();
                    if (u_input == 1) {
                        rental = true;
                        System.out.println("반납이 완료되었습니다. 감사합니다.");
                    } else {
                        System.out.println("반납이 취소되었습니다.");
                    }
                }
                bookList.get(i).setStatus(rental);
            }
        } mainMenu();

    }






}





