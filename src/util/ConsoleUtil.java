package util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Book;
import vo.Member;

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
        sc.nextLine();
        String book_name = sc.nextLine();
        out.print("작가 입력 : ");
        String book_writer = sc.next();

        out.println(book_no + book_name + book_writer);
        out.println("해당 도서를 등록하시겠습니까?");
        out.println("［ 1 ：등록 ］ ［ 아무키 ：아니오 ］");
        out.print("\n➥ 메뉴 선택 : ");

        return new Book(book_no, book_name, book_writer);
    };

    public Member getNewMember(int member_no, Scanner sc) { //도서등록
        boolean loof = true;
        String member_name;
        String member_phone;
        do {
            out.println("──────────────────────────");
            out.println("새로운 회원등록을 시작합니다.");
            out.println("등록하고자 입력한 회원번호 : " +member_no);

            out.print("회원이름 입력 : ");
            sc.nextLine();
            member_name = sc.nextLine();
            out.print("연락처 입력 : ");
            member_phone = sc.next();

            out.println(member_no + member_name + member_phone);
            out.println("해당 회원을 등록하시겠습니까?");
            out.println("［ 1 ：등록 ］ ［ 아무키 ：아니오 ］");
            out.print("\n➥ 메뉴 선택 : ");
            int selectNo = sc.nextInt();
            if (selectNo == 1) loof = false;
        } while (loof);

        return new Member(member_no, member_name, member_phone);
    };


    public void printRegistSucess(Book newBook) {
        out.println("새로운 도서가 등록되었습니다.");
    }

    public void printRegistSucess(Member newMember) {
        out.println("새로운 회원이 등록되었습니다.");
    }

    public void printRegistFail(Book newBook) {
        out.println("도서 등록을 실패하였습니다");
    }

    public void printRegistFail(Member newMember) {
        out.println("회원등록을 실패하였습니다");
    }

    public void printBookList(ArrayList<Book> bookList) {


            for (int i = 0; i < bookList.size(); i++) {
               out.println(bookList.get(i).toString());
            }

        out.println("――――――――――――――――――――――");
        out.println("총 " + bookList.size() + "권의 도서가 등록되어있습니다.\n");
        }

        public void printBookList_rental(ArrayList<Book> bookList) {

            out.println("대여할 리스트 확인리스트");
            for (int i = 0; i < bookList.size(); i++) {
                out.print(bookList.get(i).toString() + "  ");
                out.println(bookList.get(i).toString_rental());
            }
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

    public int getSearchMenuNum_member(Scanner sc) {
        out.println("책 검색 메뉴-------------");
        out.println("［ 1 ：회원이름으로 검색 ］ ［ 2 ：회원번호로 검색 ］");
        out.println("\n➥ 메뉴 선택 : ");
        return sc.nextInt();
    }

    public int getBook_no(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + " 도서번호 입력 : ");
        return sc.nextInt();
    }

    public String getBook_name(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + " 도서제목 입력 : ");
        return sc.next();
    }

    public String getMember_name(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + " 회원이름 입력 : ");
        return sc.next();
    }

    public String book_writer(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + " 작가 입력 : ");
        return sc.next();
    }


        public void printSearchBookCancel() {
            out.println("책 관리 화면으로 이동합니다.");
        }

        public void printSearchMemberCancel() {
            out.println("회원관리 화면으로 이동합니다.");
        }

        public void printSearchMenuWrong() {
            out.println("잘못 선택했습니다");
        }

        public void printSearchBookListNotFound() {
            out.println("검색 조건에 해당하는 책이 존재하지 않습니다.");
        }

        public void printSearchMemberListNotFound() {
            out.println("검색 조건에 해당하는 회원이 없습니다.");
        }

        /*public void printBookNotFound(int book_no) { out.println("해당 도서번호에 해당하는 책이 존재하지 않습니다."); }*/

        public Book getChangeBook(Book modifyBook, Scanner sc) throws IOException {

        //sc.useDelimiter(System.getProperty("line.separator")); // 행구분문자
            out.println("변경할 책 정보 입력을 시작합니다. \n");


            out.println("수정할 책 제목 입력 : ");
            sc.nextLine();
            String book_name = sc.nextLine();


            out.println("수정할 작가 이름 : ");
            String book_writer = sc.next();

            return new Book(modifyBook.getBook_no(), book_name, book_writer);
        }


    public Book getChangeBook_rental(Book modifyBook, Scanner sc) throws IOException {

        //sc.useDelimiter(System.getProperty("line.separator")); // 행구분문자
        out.println("상태 변경 시작 \n");


        out.println("대여/반납 상태를 변경하시려면 1, 아니면 아무키");
        int selectNo = sc.nextInt();
        boolean book_rental = false;
        if(selectNo == 1) book_rental = !book_rental;

        return new Book(modifyBook.getBook_no(), book_rental);
    }



    public Member getChangeMember(Member modifyMember, Scanner sc) throws IOException {

        out.println("변경할 회원정보 입력을 시작합니다. \n");


        out.println("수정할 회원이름 입력 : ");
        sc.nextLine();
        String member_name = sc.nextLine();


        out.println("수정할 연락처 입력 : ");
        String member_phone = sc.next();

        return new Member(modifyMember.getMember_no(), member_name, member_phone);
    }

    public Member getChangeMember_rental(Member modifyMember, Scanner sc) throws IOException {

        out.println("변경할 회원정보 입력을 시작합니다. \n");


        out.println("수정할 회원이름 입력 : ");
        sc.nextLine();
        String member_name = sc.nextLine();


        out.println("수정할 연락처 입력 : ");
        String member_phone = sc.next();

        return new Member(modifyMember.getMember_no(), member_name, member_phone);
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


    public void printRentalPossible(int book_no) {
        out.println(book_no + "번 책은 현재 대여가능합니다. 대여하시겠습니까?");
    }

    public void printRentalImpossible(int book_no) {
        out.println(book_no + "번 책은 현재 반납가능합니다. 반납하시겠습니까?");
    }
    
    public void printRentalSuccess(int book_no) {
        out.println(book_no + "번 책이 대여불가로 변경되었습니다.");
    }

    public void printRentalFail(int book_no) {
        out.println(book_no + "번 책이 대여가능으로 변경되었습니다.");
    }


    public void printMemberList(ArrayList<Member> memberList) {

        out.println("――――――――――――――――――――――");
        out.println("회원번호    이름    연락처    대여 중인 책");
        out.println("――――――――――――――――――――――");

        for (int i = 0; i < memberList.size(); i++) {
            out.println(memberList.get(i).toString());
        }

        out.println("――――――――――――――――――――――");
        out.println("총 " + memberList.size() + "명의 회원이 등록되어있습니다.\n");
    }

    public void printMemberListNotFound() {
        out.println("해당 회원은 존재하지 않습니다.");
    }

    public int getMember_no(String msgKind, Scanner sc) {
        System.out.print("\n> " + msgKind + " 등록하고자하는 회원번호 입력 : ");
        return sc.nextInt();
    }


}//class end




