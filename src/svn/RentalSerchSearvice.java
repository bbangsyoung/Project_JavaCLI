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


    //수정용으로 가져옴
    public Member getModifyMember(int member_no) {
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        Member modifyMember = memberDAO.selectMember(member_no);
        close(con);
        return modifyMember;
    }


    public boolean modifyMember_rental(Member changeMember) throws Exception {

        boolean isModifySuccess = false;
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);

        int upDateCount = memberDAO.updateMember(changeMember);

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
