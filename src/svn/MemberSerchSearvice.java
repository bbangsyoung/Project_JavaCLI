package svn;

import dao.BookDAO;
import dao.MemberDAO;
import vo.Book;
import vo.Member;

import java.sql.Connection;
import java.util.ArrayList;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;


public class MemberSerchSearvice {

    public ArrayList<Member> getSearchMemberListByMember_name(String member_name) {
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        ArrayList<Member> searchMemberList = memberDAO.selectMemberListByMember_name(member_name);
        return searchMemberList;
    }


    public ArrayList<Member> getSearchMemberListByMember_no(int member_no) {
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        ArrayList<Member> searchMemberList = memberDAO.selectMemberByMember_no(member_no);
        close(con);
        return searchMemberList;
    }







}
