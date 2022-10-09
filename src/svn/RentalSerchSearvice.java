package svn;

import dao.BookDAO;
import dao.MemberDAO;
import vo.Book;
import vo.Member;

import java.sql.Connection;
import java.util.ArrayList;

import static db.JdbcUtil.*;
import static db.JdbcUtil.rollback;


public class RentalSerchSearvice {


    public ArrayList<Book> getSearchBookListByBook_no(int book_no) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        ArrayList<Book> searchBookList = bookDAO.selectBookByBook_no(book_no);
        close(con);
        return searchBookList;
    }

    public static Book getModifyBook_rental(int book_no_rental) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        Book modifyBook = bookDAO.selectBook(book_no_rental);
        close(con);
        return modifyBook;
    }

    public static boolean modifyBook_rental(Book changeBook) throws Exception {

        boolean isModifySuccess = false;
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);

        int upDateCount = bookDAO.updateBook_Rental(changeBook);

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
