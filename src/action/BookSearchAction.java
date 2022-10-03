package action;

import controller.BookController;
import svn.BookSerchSearvice;
import util.ConsoleUtil;
import vo.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookSearchAction implements Action{
    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookSerchSearvice bookSerchService = new BookSerchSearvice();

    @Override
    public void execute(Scanner sc) throws Exception {
        int searchMenuNum = consoleUtil.getSearchMenuNum(sc);
        ArrayList<Book> searchBookList = null;

        if(searchMenuNum == 1) {
            String book_name = consoleUtil.getBook_name("➥",sc);
            searchBookList = bookSerchService.getSearchBookListByBook_name(book_name);

        } else if (searchMenuNum == 2) {
            int book_no = consoleUtil.getBook_no("➥", sc);
            searchBookList = bookSerchService.getSearchBookListByBook_no(book_no);
        } else if (searchMenuNum == 3) {
            String book_writer = consoleUtil.book_writer("➥ ", sc);
            searchBookList = bookSerchService.getSearchBookListByBook_writer(book_writer);
        } else if (searchMenuNum == 4) {
            consoleUtil.printSearchBookCancel();
            return;
        } else {
            consoleUtil.printSearchMenuWrong();
            Action action = new BookSearchAction();
            BookController bookController = new BookController();
            bookController.requestProcess(action, sc);
            return;
        }

        if(searchBookList != null) {
            consoleUtil.printBookList(searchBookList);
        } else {
            consoleUtil.printSearchBookListNotFound();
        }


    }
}
