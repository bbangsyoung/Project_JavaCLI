package util;
import java.util.ArrayList;
import java.util.Scanner;
import action.Action;
import action.BookAddAction;
import ui.BookUI;
import vo.Book;
import static java.lang.System.out;

public class ConsoleUtil {

    //도서 관련 콘솔 유틸
    public void printRegistedBook(int book_no) { //도서번호 중복 시
        out.println(book_no + "번은 이미 등록된 도서번호 입니다.");
    }

    public Book getNewBook(int book_no, Scanner sc) { //도서등록
        out.println("──────────────────────────");
        out.println("새로운 도서등록을 시작합니다.");
        out.println("──────────────────────────");

        out.print("도서 제목 입력 : ");
        String book_name = sc.next();
        out.print("작가 입력 : ");
        String book_writer = sc.next();

        out.println(book_no + book_name + book_writer);
        out.println("해당 도서를 등록하시겠습니까?");
        out.println("［ 1 ：등록 ］ ［ 아무키 ：아니오 ］");
        out.print("\n➥ 메뉴 선택 : ");
        return new Book(book_no, book_name, book_writer);
    };

    public void printRegistSucess(Book newBook) {
        out.println("새로운 도서가 등록되었습니다.");
    }

    public void printRegistFail(Book newBook) {
        out.println("도서 등록을 실패하였습니다");
    }

    public void printBookList(ArrayList<Book> bookList) {

            for (int i = 0; i < bookList.size(); i++) {
               out.println(bookList.get(i).toString());
            }

        out.println("―――――――――――――――――――――――――――――");
        out.println("총 " + bookList.size() + "권의 도서가 등록되어있습니다.");
        }

        public void printBookListNotFound() {
            out.println("해당 도서번호는 존재하지 않습니다.");
        }

        public int getSearchMenuNum(Scanner sc) {
            out.println("책 검색 메뉴-------------");
            out.println("［ 1 ：도서제목으로 검색 ］ ［ 2 ：도서번호로 검색 ］ ［ 3 ：작가이름으로 검색 ］");
             out.println("\n➥ 메뉴 선택 : ");
            return sc.nextInt();
        }

    public int getBook_no(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + "➥ 등록하고자 하는 도서번호 입력 : ");
        return sc.nextInt();
    }

    public String getBook_name(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + "➥ 도서제목 입력 : ");
        return sc.next();
    }

    public String book_writer(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + "➥ 작가 입력 : ");
        return sc.next();
    }


        public void printSearchBookCancel() {
            out.println("책 관리 화면으로 이동합니다.");
        }

        public void printSearchMenuWrong() {
            out.println("잘못 선택했습니다");
        }

        public void printSearchBookListNotFound() {
            out.println("검색 조건에 해당하는 책이 존재하지 않습니다.");
        }

        /*public void printBookNotFound(int book_no) { out.println("해당 도서번호에 해당하는 책이 존재하지 않습니다."); }*/

        public Book getChangeBook(Book modifyBook, Scanner sc) {
        sc.useDelimiter(System.getProperty("line.separator")); // 행구분문자
            out.println("변경할 책 정보 입력---");

            out.println("수정할 책 제목 입력 : ");
            String book_name = sc.nextLine();
            sc.nextLine();

            out.println("수정할 작가 이름 : ");
            String book_writer = sc.nextLine();

            return new Book(modifyBook.getBook_no(), book_name, book_writer);
        }

        public void printModifySuccess(int book_no){
            out.println(book_no + "번 책이 수정되었습니다.");
        }

    public void printModifyFail(int book_no){ out.println(book_no + "번 책 정보수정이 실패했습니다."); }

    public void printDeleteSuccess(int book_no){
        out.println(book_no + "번 책이 삭제되었습니다.");
    }

    public void printDeleteFail(int book_no){
        out.println(book_no + "번 책의 정보삭제가 실패하였습니다.");
    }









        
        















}//class end




