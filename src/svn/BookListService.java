package svn;
import dao.BookDAO;
import vo.Book;
import java.sql.Connection;
import java.util.ArrayList;
import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

public class BookListService {

    public ArrayList<Book> getBookList() {
        Connection con  = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        ArrayList<Book> bookList = bookDAO.selectBookList();
//        BookDAO bookmemberDAO = new BookDAO(con);
//        ArrayList<Book> bookList = bookmemberDAO.selectBooktList();
        close(con);

        return bookList;
    }



}
