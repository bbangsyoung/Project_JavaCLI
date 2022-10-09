package action;

import svn.MemberModifyService;
import svn.RentalSerchSearvice;
import util.ConsoleUtil;
import vo.Book;
import vo.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalAction implements Action{
    ConsoleUtil consoleUtil = new ConsoleUtil();
    RentalSerchSearvice rentalSerchService = new RentalSerchSearvice();

    @Override
    public void execute(Scanner sc) throws Exception {

        ArrayList<Book> searchBookList = null;


        int book_no = consoleUtil.getBook_no("대여반납할 책넘버➥",sc);
        searchBookList = rentalSerchService.getSearchBookListByBook_no(book_no);

        if(searchBookList != null) {
            consoleUtil.printBookList_rental(searchBookList);
            System.out.println("현재 있는책!");
        } else {
            consoleUtil.printSearchBookListNotFound();
        }











    }
}
