package action;
import java.util.Scanner;
import svn.BookAddService;
import util.ConsoleUtil;
import vo.Book;

public class BookAddAction implements Action{

    ConsoleUtil consoleUtil = new ConsoleUtil();
    BookAddService bookAddservice = new BookAddService();

    @Override
    public void execute(Scanner sc) throws Exception {
       int book_no = consoleUtil.getBook_no("",sc);
       boolean isRegisted = bookAddservice.searchBook(book_no);

       if(isRegisted) {
           consoleUtil.printRegistedBook(book_no);
           return;
       }

       Book newBook = consoleUtil.getNewBook(book_no, sc);

       boolean isRegistBook = bookAddservice.registBook(newBook);
       if(isRegistBook) consoleUtil.printRegistSucess(newBook);
       else consoleUtil.printRegistFail(newBook);

    }
}
