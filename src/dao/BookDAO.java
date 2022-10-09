package dao;

import vo.Book;

import java.sql.*;
import java.util.ArrayList;

import static db.JdbcUtil.close;

public class BookDAO {

    Connection con;
    public BookDAO(Connection con) {
        this.con = con;
    }

    public int insertBook(Book newBook) {
        int insertCount = 0;
        PreparedStatement pstmt = null;
        String sql = "insert into book value (?,?,?,?);";


        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, newBook.getBook_no());
            pstmt.setString(2, newBook.getBook_name());
            pstmt.setString(3, newBook.getBook_writer());
            pstmt.setBoolean(4,false);
            insertCount = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return insertCount;
    }



    public ArrayList<Book> selectBookList() {
        ArrayList<Book> bookList = null;
        Book book = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book";

        try{
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                bookList = new ArrayList<Book>();

                do {
                    book = new Book(
                            rs.getInt("book_no"),
                            rs.getString("book_name"),
                            rs.getString("book_writer"),
                            rs.getBoolean("book_rental"));
                    bookList.add(book);
                } while (rs.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        close(rs);
        close(pstmt);
        }
        return bookList;
    }

    public Book selectBook(int book_no) {
        Book book = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book where book_no = ?";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, book_no);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                book = new Book(
                        rs.getInt("book_no"),
                        rs.getString("book_name"),
                        rs.getString("book_writer"),
                        rs.getBoolean("book_rental")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            close(rs);
            close(pstmt);
        }
        return book;
    }

    public Book selectBookRental(int book_no) {
        Book book = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book where book_no = ?";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, book_no);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                book = new Book(rs.getBoolean("book_rental"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            close(rs);
            close(pstmt);
        }
        return book;
    }



    public ArrayList<Book> selectBookByBook_no(int book_no) {
        ArrayList<Book> searchBookList = null;
        Book searchBook = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book WHERE book_no like concat(?, '%')";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, book_no);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                searchBookList = new ArrayList<Book>();

                do {
                    searchBook = new Book(
                            rs.getInt("book_no"),
                            rs.getString("book_name"),
                            rs.getString("book_writer"),
                            rs.getBoolean("book_rental")
                    );
                    searchBookList.add(searchBook);

                } while (rs.next());
            }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return searchBookList;
    }

public ArrayList<Book> selectBookListByBook_name(String book_name) {
    ArrayList<Book> searchBookList = null;
    Book searchBook = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM book WHERE book_name like concat('%', ?, '%')";

    try{
        pstmt = con.prepareStatement(sql);

        pstmt.setString(1, book_name);
        rs = pstmt.executeQuery();

        if(rs.next()) {
            searchBookList = new ArrayList<Book>();

            do{
                searchBook = new Book(
                        rs.getInt("book_no"),
                        rs.getString("book_name"),
                        rs.getString("book_writer"),
                        rs.getBoolean("book_rental"));

                        searchBookList.add(searchBook);
            } while(rs.next());
        }

    } catch (Exception e) {
        e.printStackTrace();;
    } finally {
        close(rs);
        close(pstmt);
    }
    return searchBookList;
}



    public ArrayList<Book> selectBookListByBook_rental(int book_no) {
        ArrayList<Book> searchBookList = null;
        Book searchBook = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book WHERE book_no like concat(?)";

        try{
            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, book_no);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                searchBookList = new ArrayList<Book>();

                do{
                    searchBook = new Book(
                            rs.getBoolean("book_rental"));

                    searchBookList.add(searchBook);
                } while(rs.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return searchBookList;
    }




    public ArrayList<Book> selectBookListByBook_writer(String book_writer) {
        ArrayList<Book> searchBookList = null;
        Book searchBook = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM book WHERE book_writer like concat('%', ?, '%')";

        try{
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, book_writer);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                searchBookList = new ArrayList<Book>();

                do{
                    searchBook = new Book(
                            rs.getInt("book_no"),
                            rs.getString("book_name"),
                            rs.getString("book_writer"),
                            rs.getBoolean("book_rental"));

                    searchBookList.add(searchBook);
                } while(rs.next());
            }

        } catch (Exception e) {
            e.printStackTrace();;
        } finally {
            close(rs);
            close(pstmt);
        }
        return searchBookList;
    }




public int deleteBook(int book_no) {
        int deleteCount = 0;
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM book WHERE book_no = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, book_no);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
    return deleteCount;
}


    public int updateBook(Book changeBook) throws Exception{

        int updateCount = 0;
        PreparedStatement pstmt = null;
        String sql = "UPDATE book SET book_name=?, book_writer=? WHERE book_no=?;";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, changeBook.getBook_name());
            pstmt.setString(2, changeBook.getBook_writer());
            pstmt.setInt(3, changeBook.getBook_no());

            updateCount = pstmt.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally{
            close(pstmt);
        }

        return updateCount;

    }


    public int updateBookReantal(Book changeBook) throws Exception{

        int updateCount = 0;
        PreparedStatement pstmt = null;
        String sql = "UPDATE book SET book_name=?, book_writer=? WHERE book_no=?;";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, changeBook.getBook_name());
            pstmt.setString(2, changeBook.getBook_writer());
            pstmt.setInt(3, changeBook.getBook_no());

            updateCount = pstmt.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally{
            close(pstmt);
        }

        return updateCount;

    }




}//BookDAO class end
