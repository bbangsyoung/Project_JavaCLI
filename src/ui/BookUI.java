package ui;

import action.*;
import controller.BookController;

import java.util.Scanner;

public class BookUI {
    public static void main(String[] args) {
        boolean isStop = false;

        Scanner sc = new Scanner(System.in);

        boolean isOutStop = false;
        boolean isInnerStop = false;
        int outerMenu = 0;
        int innerMenu = 0;

        Action action = null;
        BookController bookcontroller = new BookController();

        do{
            System.out.println("도서대여 프로그램");
            System.out.println("1. 도서관리");
            System.out.println("2. 회원관리");
            System.out.println("3. 임시 테스트 메뉴");
            System.out.println("4. 프로그램 종료");
            System.out.println("메뉴를 입력하세요 > ");
            outerMenu = sc.nextInt();
            isInnerStop = false;

            switch (outerMenu) {
                case 1: //도서관리
                    do {
                        System.out.println("도서관리 메뉴");
                        System.out.println("1. 도서등록");
                        System.out.println("2. 도서조회");
                        System.out.println("3. 도서검색");
                        System.out.println("4. 도서수정");
                        System.out.println("5. 도서삭제");
                        System.out.println("6. 첫화면으로");
                        System.out.println("메뉴 선택 >> ");
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
                                System.out.println("처음 메뉴로 이동합니다.");
                                isInnerStop = true;
                                action = null;
                                break;

                            default:
                                System.out.println("잘못 입력하셨습니다.");
                                action = null;
                                break;
                        }

                        if(action != null) {
                            bookcontroller.requestProcess(action, sc);
                        }
                         } while(!isInnerStop);
                            break;


                case 2: //회원관리
                    do{
                        System.out.println("회원관리 메뉴 ~~");
                        System.out.println("1. 회원정보 입력");
                        System.out.println("2. 회원정보 조회");
                        System.out.println("3. 회원정보 검색");
                        System.out.println("4. 회원정보 수정");
                        System.out.println("5. 회원정보 삭제");
                        System.out.println("6. 첫화면으로");
                        System.out.println("메뉴 선택 >> ");
                        innerMenu = sc.nextInt();

                        switch (innerMenu) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                System.out.println("첫 화면으로 이동합니다.");
                                isInnerStop = true;
                                action = null;
                                break;
                            default:
                                System.out.println("프로그램을 종료합니다.");
                                break;
                        }

                        if(action != null) {
                            bookcontroller.requestProcess(action, sc);
                        }
                    } while (!isInnerStop);
                    break;

                case 3:
                    System.out.println("임시 테스트 메뉴라니깐~");
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다!!!!!!!!!");
                    isOutStop = true;
                    break;

                default:
                    System.out.println("잘못 누르셨습니다요ㅠㅠ");
                    break;
            }//switch end

        } while (!isOutStop);

    }

}
