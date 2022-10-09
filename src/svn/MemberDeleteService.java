package svn;

import dao.MemberDAO;
import vo.Member;

import java.sql.Connection;

import static db.JdbcUtil.*;

public class MemberDeleteService {

    public Member getDeleteMember(int member_no) {
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        Member deleteMember = memberDAO.selectMember(member_no);
        close(con);
        return deleteMember;
    }

    public boolean DeleteMember(int member_no) {
        boolean isDeleteSuccess = false;
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        int deleteCount = memberDAO.deleteMember(member_no);

        if(deleteCount > 0) {
            isDeleteSuccess = true;
            commit(con);
        } else {
            rollback(con);
        }
        close(con);
        return isDeleteSuccess;

    }


}
