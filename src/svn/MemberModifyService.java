package svn;

import dao.BookDAO;
import dao.MemberDAO;
import vo.Book;
import vo.Member;

import java.sql.Connection;

import static db.JdbcUtil.*;

public class MemberModifyService {


    public Member getModifyMember(int member_no) {
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        Member modifyMember = memberDAO.selectMember(member_no);
        close(con);
        return modifyMember;
    }

    public boolean modifyMember(Member changeMember) throws Exception {

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
