package svn;

import dao.BookDAO;
import dao.MemberDAO;
import vo.Book;
import vo.Member;

import java.sql.Connection;

import static db.JdbcUtil.*;

public class MemberAddService {
    public boolean searchMember(int member_no){
        boolean isRegited = false;
        Connection con = getConnection();
        MemberDAO memberDAO = new MemberDAO(con);
        Member member = memberDAO.selectMember(member_no);

        if(member!=null) {
            isRegited = true;
        }
        close(con);
        return isRegited;
    }

    public boolean registMember(Member newMember) {
        boolean isRegistSuccess = false;
        Connection con = getConnection(); //Connection 객체를 얻어오는 부분. 트랜잭션을 처리하기 위해 Connection 객체를 Service 클래스에서 생성
        MemberDAO memberDAO = new MemberDAO(con); //DAO 클래스 객체 생성

        int insertCount = memberDAO.insertMember(newMember);


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
