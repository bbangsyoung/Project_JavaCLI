package svn;

import dao.BookDAO;
import vo.Book;

import java.sql.Connection;

import static db.JdbcUtil.*;
public class BookModifyService {


    public Book getModifyBook(int book_no) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        Book modifyBook = bookDAO.selectBook(book_no);
        close(con);
        return modifyBook;
    }

    public boolean modifyBook(Book changeBook) throws Exception {

        boolean isModifySuccess = false;
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);

        int upDateCount = bookDAO.updateBook(changeBook);

        if(upDateCount > 0) {
            isModifySuccess = true;
            commit(con);

        } else {
            rollback(con);
        }

        close(con);
        return isModifySuccess;


    }

}
