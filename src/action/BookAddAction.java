package action;
import java.util.Scanner;
import svn.BookAddService;
import util.ConsoleUtil;
import vo.Book;

public class BookAddAction implements Action{

    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookAddService bookservice = new BookAddService();

    @Override
    public void execute(Scanner sc) throws Exception {
       int book_no = consoleUtil.getBook_no("",sc);
       boolean isRegisted = bookservice.searchBook(book_no);

       if(isRegisted) {
           consoleUtil.getNewBook(book_no,sc);
           return;
       }

       Book newBook = consoleUtil.getNewBook(book_no,sc);


       boolean isRegistBook = bookservice.registBook(newBook);

       if(isRegistBook) {
           consoleUtil.printRegistSucess(newBook);
       } else {
           consoleUtil.printRegistFail(newBook);
       }

    }
}
