import Vo.BookVo;
import Vo.MemberVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class Book extends Admin {

    Scanner scan = new Scanner(System.in);
    PrintScan p = new PrintScan();
    BookVo book = new BookVo();

    List<BookVo> bookList = new ArrayList<BookVo>();
    Member member = new Member();
    int selectNo; //메뉴선택용

    public Book() {
    } //기본 생성자



    public void lookupBook() { //도서조회
       p.mainMenu(1);
        selectNo = p.getInt("메뉴입력 >>");

        if (selectNo == 1) { //1.모든 도서보기
            p.getString("［ 전체 도서 목록 ］");
            for (int i = 0; i < bookList.size(); i++) {
                out.println(bookList.get(i).toString());
            }
        } else if (selectNo == 2) { //2.책 번호로 찾기
            selectNo = p.getInt("검색할 책 번호 입력 >> ");
            for (int i = 0; i < bookList.size(); i++) {
                if (selectNo == bookList.get(i).getNumber()) {
                    p.getString(bookList.get(i).toString());
                    break;
                }
            }
        }  else {
            p.print("잘못입력하셨습니다. 다시 진행해주세요.");
            lookupBook();
        }
    }

    void bookAdd() { //도서등록
        book.setNumber(p.getInt("책 번호 입력 >>"));
        book.setTitle(p.getString("책 제목 입력 >>"));
        scan.nextLine();
        book.setAuthor(p.getString("작가 입력 >>"));
        book.setStatus(true);

        p.print("――――――――――――――――――――\n");
        p.print("No." + book.getNumber() + ", 제목: " + book.getTitle() + ", 작가: " + book.getAuthor());
        p.print("――――――――――――――――――――\n");

        selectNo = p.getInt("위 내용이 맞습니까? 맞으면 1, 틀리면 2");
        if (selectNo == 1) {
            bookList.add(book);
            p.print("도서등록을 완료하였습니다.");
        } else if (selectNo == 2) p.print("도서등록을 실패하였습니다.");
        else p.print("잘못입력하셨습니다.");
    }

    void bookModify() {
        selectNo = p.getInt("수정할 책 번호를 입력해주세요 >> ");
        for (int i = 0; i < bookList.size(); i++) {
            if (selectNo == bookList.get(i).getNumber()) {
                bookList.get(i).setTitle(p.getString("수정할 책 제목 입력>> "));
                scan.nextLine();
                bookList.get(i).setAuthor(p.getString("수정할 작가이름 입력 >> "));
                p.print("도서수정 완료.");
            } else {
                p.print("해당 책 정보는 없습니다.");
            }
        }
    }

    void bookdelete() {
       selectNo = p.getInt("삭제할 책 번호를 입력해주세요 >> ");
        for (int i = 0; i < bookList.size(); i++) {
            if (selectNo == bookList.get(i).getNumber()) {
                bookList.remove(i);
                p.print("삭제완료");
            } else {
                p.print("해당 책 번호는 없습니다.");
            }
        }
    }

    void brBook() {
        Member member = new Member();


        p.print("도서 대여/반납 메뉴입니다.");
        selectNo = p.getInt("처리하고자 하는 도서 번호 입력 >>");

        for (int i = 0; i < bookList.size(); i++) {
            if (selectNo == bookList.get(i).getNumber()) {
                boolean rental = bookList.get(i).isStatus();
                if (rental) {
                    selectNo = p.getInt("대여가 가능합니다. 대여하시겠습니까? 대여1, 취소2");
                    if (selectNo == 1) {
                        //입력한 회원이름을 member 클래스로 보내서 있는 회원인지 검증하게 하자!
                        scan.nextLine();
                        String inputMan = p.getString("대여하는 회원이름 검색");
                        member.serchMember(inputMan);
                        p.print("-----제대로 떴나?");
                        rental = false;
                        p.print("대여가 완료되었습니다.");
                    } else {
                        p.print("대여가 취소되었습니다.");
                    }
                } else {
                    selectNo = p.getInt("해당 책은 현재 대여중입니다. 반납하시려면1 취소2");
                    if (selectNo == 1) {
                        rental = true;
                        p.print("반납이 완료되었습니다.");
                    } else {
                        p.print("반납이 취소되었습니다.");
                    }
                }
                bookList.get(i).setStatus(rental);
            } else {
                p.print("검색하신 번호의 책은 없습니다.");
            }
        }
    }


}





