package svn;
import dao.BookDAO;
import vo.Book;
import java.sql.Connection;
import static db.JdbcUtil.*;

public class BookDeleteService {

    public Book getDeleteBook(int book_no) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        Book deleteBook = bookDAO.selectBook(book_no);
        close(con);
        return deleteBook;
    }

    public boolean DeleteBook(int book_no) {
        boolean isDeleteSuccess = false;
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        int deleteCount = bookDAO.deleteBook(book_no);

        if(deleteCount > 0) {
            isDeleteSuccess = true;
            commit(con);
        } else {
            rollback(con);
        }
        close(con);
        return isDeleteSuccess;

    }


}
