package action;

import svn.BookModifyService;
import util.ConsoleUtil;
import vo.Book;

import java.util.Scanner;

public class BookModifyAction implements Action {

    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookModifyService bookModifyService = new BookModifyService();

    @Override
    public void execute(Scanner sc) throws Exception {

        int book_no = consoleUtil.getBook_no("수정하쉴? ", sc);
        Book modifyBook = bookModifyService.getModifyBook(book_no);
        Book changeBook = consoleUtil.getChangeBook(modifyBook, sc);

        boolean isModifySuccess = bookModifyService.modifyBook(changeBook);

        if(isModifySuccess) {
            consoleUtil.printModifySuccess(book_no);
        } else {
            consoleUtil.printModifyFail(book_no);
        }

    }
}
