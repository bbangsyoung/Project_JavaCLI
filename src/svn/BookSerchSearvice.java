package svn;
import static db.JdbcUtil.*;
import dao.BookDAO;
import vo.Book;
import java.sql.Connection;
import java.util.ArrayList;


public class BookSerchSearvice {

    public ArrayList<Book> getSearchBookListByBook_name(String book_name) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        ArrayList<Book> searchBookList = bookDAO.selectBookListByBook_name(book_name);
        return searchBookList;
    }


    public ArrayList<Book> getSearchBookListByBook_no(int book_no) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        ArrayList<Book> searchBookList = bookDAO.selectBookByBook_no(book_no);
        close(con);
        return searchBookList;
    }

    public ArrayList<Book> getSearchBookListByBook_writer(String book_writer) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        ArrayList<Book> searchBookList = bookDAO.selectBookListByBook_writer(book_writer);
        return searchBookList;
    }






}
