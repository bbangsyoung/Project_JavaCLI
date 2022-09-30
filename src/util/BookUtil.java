package util;
import java.awt.print.Book;
import java.util.Scanner;

import static java.lang.System.out;

public class BookUtil {

    //도서 관련 콘솔 유틸
    public void printBookOverlap(int bookNumber) { //도서번호 중복 시
        System.out.println(bookNumber + "번은 이미 등록된 도서번호 입니다. ");
    }

    public Book getNewBook(int book_Number, Scanner sc) { //도서등록

        System.out.println("도서 등록을 시작합니다.");

        System.out.println("책 제목 입력 > ");
        String book_name = sc.next();
        System.out.println("작가 입력 > ");
        String book_writer = sc.next();

        return new Book(book_Number, book_name, book_writer);
    };


    public void printRegistSucess(Book newBook) {
        System.out.println("새로운 도서가 등록되었습니다.");
    }


    public void printRegistFail(Book newBook) {
        System.out.println("도서 등록을 실패하였습니다");
    }

    public void printBookList() {
        System.out.println("총 " + bookList.size() + "권의 도서를 조회합니다.");
        System.out.println("―――――――――――――――――――――――――――――");
        System.out.println("도서등록번호 / 책 제목 / 작가 / 대여여부");

            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).toString());
            }
        }

        public void printBookListNotFound() {
            out.println("해당 책 번호는 존재하지 않습니다.");
        }

        public int getSearchMenuNum(Scanner sc) {
            out.println("책 검색 메뉴-------------");
            out.println("1. 책 번호로 검색-------------");
            out.println("2. 작가 이름으로 검색-------------");
            out.println("선택 > ");
            return sc.nextInt();
        }

        public void printSearchBookCancel() {
            out.println("책 관리 화면으로 이동합니다.");
        }

        public void printSearchMenuWrong() {
            out.println("잘못 선택했습니다");
        }

        public void printSearchBookListNotFound() {
            out.println("검색 조건에 해당하는 책이 존재하지 않소(수정?)");
        }

        public void printSearchBookNotFound(int book_number) {
            out.println("해당 등록번호에 해당하는 책이 없어!!!!");
        }

        public Book getChangeBook(Book modifyBook, Scanner sc) {
        sc.useDelimiter(System.getProperty("line.separator")); // 행구분문자
            out.println("변경할 책 정보 입력---");

            out.println("수정할 책 제목 입력 : ");
            String book_name = sc.next();

            out.println("수정할 작가 이름 : ");
            String book_writer = sc.next();

            return new Book(modifyBook.getBook_no(), book_name, book_writer);
        }

        public void printModifySuccess(int book_number){
            out.println(book_number + "번 책이 수정되었습니다.");
        }

    public void printModifyFail(int book_number){
        out.println(book_number + "번 책 정보수정이 실패했습니다.");
    }

    public void printDeleteSuccess(int book_number){
        out.println(book_number + "번 책이 삭제되었습니다.");
    }










        
        















}//class end




