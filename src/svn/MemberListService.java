package svn;
import dao.MemberDAO;
import vo.Member;

import java.sql.Connection;
import java.util.ArrayList;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

public class MemberListService {

    public ArrayList<Member> getMemberList() {
        Connection con  = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        ArrayList<Member> memberList = memberDAO.selectMemberList();
        close(con);

        return memberList;
    }



}
