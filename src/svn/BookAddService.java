package svn;
import dao.BookDAO;
import vo.Book;
import java.sql.Connection;
import static db.JdbcUtil.*;

public class BookAddService {
    public boolean searchBook(int book_no){
        boolean isRegited = false;
        Connection con = getConnection();
        BookDAO bookDAO = new BookDAO(con);
        Book book = bookDAO.selectBook(book_no);

        if(book!=null) {
            isRegited = true;
        }
        close(con);
        return isRegited;
    }

    public boolean registBook(Book newBook) {
        boolean isRegistSuccess = false;
        Connection con = getConnection(); //Connection 객체를 얻어오는 부분. 트랜잭션을 처리하기 위해 Connection 객체를 Service 클래스에서 생성
        BookDAO bookDAO = new BookDAO(con); //DAO 클래스 객체 생성

        int insertCount = bookDAO.insertBook(newBook);


        if(insertCount > 0) {
            isRegistSuccess = true;
            commit(con);
        } else {
            rollback(con);
        }

        close(con);
        return isRegistSuccess;
    }
}
