package svn;

import dao.BookDAO;
import vo.Book;

import java.sql.Connection;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

public class BookRentalService {


    public Book getRentalBook(int book_no) {
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);

        Book rentalBook = bookDAO.selectRentalBook(book_rental);
        close(con);
        return rentalBook;
    }

    public Book rentalBook() {

    }





}
