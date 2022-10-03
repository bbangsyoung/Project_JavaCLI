package action;

import svn.BookListService;
import util.ConsoleUtil;
import vo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookListAction implements Action {

    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookListService bookListService = new BookListService();

    @Override
    public void execute(Scanner sc) throws Exception {
        ArrayList<Book> bookList = bookListService.getBookList();

        if(bookList != null) {
            consoleUtil.printBookList(bookList);
        } else {
            consoleUtil.printBookListNotFound();
        }



    }
}
