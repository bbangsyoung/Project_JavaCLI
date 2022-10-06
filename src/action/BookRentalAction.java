package action;

import java.util.ArrayList;
import java.util.Scanner;

import svn.BookListService;
import svn.BookModifyService;
import svn.BookRentalService;
import util.ConsoleUtil;
import vo.Book;

public class BookRentalAction implements Action {


    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookListService bookListService = new BookListService();

    @Override
    public void execute(Scanner sc) throws Exception {
        ConsoleUtil consoleUtil1 = new ConsoleUtil();
        ArrayList<Book> bookList = bookListService.getBookList();

        if(bookList != null) {
            consoleUtil.printBookRentalListTest(bookList);
        } else {
            consoleUtil.printBookListNotFound();
        }

    }


    }
