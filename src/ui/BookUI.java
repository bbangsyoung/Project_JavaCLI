package ui;

import action.*;
import controller.BookController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.out;

public class BookUI {
    public static void main(String[] args) throws IOException {
        boolean isStop = false;


        boolean isOuterStop = false;
        boolean isInnerStop = false;
        int outerMenu = 0;
        int innerMenu = 0;

        Action action = null;
        BookController bookcontroller = new BookController();

        do{
        Scanner sc = new Scanner(System.in);

            out.println("───────────────────────────────");
            out.println("        도서대여 관리 시스템       ");
            out.println("───────────────────────────────");
            out.println("［ 1 ：도서관리 ］ ［ 2 ：회원관리 ］ ［ 3 ：임시메뉴 ］ ［ 4 ：종료 ］");
            out.print("\n➥ 메뉴 선택 : ");

            outerMenu = sc.nextInt();
            isInnerStop = false;

            switch (outerMenu) {
                case 1: //도서관리
                    do {
                        out.println("도서관리 메뉴");
                        out.println("［ 1 ：도서등록 ］ ［ 2 ：도서 전체조회 ］ ［ 3 ：도서검색 ］ ［ 4 ：도서수정 ］ ［ 5 ：도서삭제 ］ ［ 6 ：도서대여반납 ］ ［ 7 ：처음으로 ］");
                        //innerMenu = 0;

                        out.println("\n➥ 도서 메뉴 선택 : ");
                        innerMenu = sc.nextInt();

                        switch (innerMenu) {
                            case 1:
                                action = new BookAddAction();
                                break;
                            case 2:
                                action = new BookListAction();
                                break;
                            case 3:
                                action = new BookSearchAction();
                                break;
                            case 4:
                                action = new BookModifyAction();
                                break;
                            case 5:
                                action = new BookDeleteAction();
                                break;
                            case 6:
                                action = new RentalAction();
                                break;
                            case 7:
                                out.println("처음으로 이동합니다.");
                                isInnerStop = true;
                                action = null;
                                break;

                            default:
                                out.println("잘못된 번호입니다.");
                                action = null;
                                break;
                        }

                        if(action != null) {
                            bookcontroller.requestProcess(action, sc);
                            out.println("\n전단계로 돌아갑니다.\n");
                        }
                         } while(!isInnerStop);
                            break;


                case 2: //회원관리
                    do{
                        out.println("회원관리 메뉴 ~~");
                        out.println("［ 1 ：회원등록 ］ ［ 2 ：회원 전체조회 ］ ［ 3 ：회원정보검색 ］ ［ 4 ：회원정보수정 ］ ［ 5 ：회원정보삭제 ］ ［ 6 ：처음으로 ］");
                        out.println("\n➥ 메뉴 선택 : ");
                        innerMenu = sc.nextInt();

                        switch (innerMenu) {
                            case 1:
                                action = new MemberAddAction();
                                break;
                            case 2:
                                action = new MemberListAction();
                                break;
                            case 3:
                                action = new MemberSearchAction();
                                break;
                            case 4:
                                action = new MemberModifyAction();
                                break;
                            case 5:
                                action = new MemberDeleteAction();
                                break;
                            case 6:
                                out.println("\n메인으로 돌아갑니다.");
                                isInnerStop = true;
                                action = null;
                                break;
                            default:
                                out.println("프로그램을 종료합니다.");
                                break;
                        }

                        if(action != null) {
                            bookcontroller.requestProcess(action, sc);
                        }
                    } while (!isInnerStop);
                    break;

                case 3:
                    out.println("임시 테스트 메뉴입니다.");
                    break;

                case 4:
                    out.println("프로그램을 종료합니다.");
                    isOuterStop = true;
                    break;

                default:
                    out.println("잘못된 번호입니다.");
                    break;
            }//switch end

        } while (!isOuterStop);

    }

}
