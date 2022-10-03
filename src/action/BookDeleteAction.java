package action;
import svn.BookDeleteService;
import util.ConsoleUtil;
import vo.Book;

import java.util.Scanner;

public class BookDeleteAction implements Action{

    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookDeleteService bookDeleteService = new BookDeleteService();
    @Override
    public void execute(Scanner sc) throws Exception {

        int book_no = consoleUtil.getBook_no("삭제할 ", sc);
        Book deleteBook = bookDeleteService.getDeleteBook(book_no);

        if(deleteBook == null) {
            consoleUtil.printBookListNotFound();
            return;
        }

        Boolean isDeleteSuccess = bookDeleteService.DeleteBook(book_no);

        if(isDeleteSuccess) {
            consoleUtil.printDeleteSuccess(book_no);
        } else {
            consoleUtil.printDeleteFail(book_no);
        }





    }
}
