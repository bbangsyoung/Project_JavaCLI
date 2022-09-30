package ui;

import action.Action;
import action.BookAddAction;
import controller.BookController;

import java.util.Scanner;

public class BookUi {
    public static void main(String[] args) {
        boolean isStop = false;
        BookController bookcontroller = new BookController();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("도서대여 프로그램");
            System.out.println("1. 도서등록");
            System.out.println("2. 도서조회");
            System.out.println("3. 도서정보수정");
            System.out.println("4. 도서정보삭제");
            System.out.println("5. 프로그램종료");
            System.out.println("메뉴를 입력하시오 > ");
            int menu = sc.nextInt();
            Action action = null;

            switch (menu) {
                case 1:
                    action = new BookAddAction();



            }//switch end


        } while (true)





    }




}
