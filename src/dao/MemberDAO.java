package dao;

import vo.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import static db.JdbcUtil.close;

public class MemberDAO {

    Connection con;
    public MemberDAO(Connection con) {
        this.con = con;
    }

    public int insertMember(Member newMember) {
        int insertCount = 0;
        PreparedStatement pstmt = null;
        String sql = "insert into member value (?,?,?,?);";


        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, newMember.getMember_no());
            pstmt.setString(2, newMember.getMember_name());
            pstmt.setString(3, newMember.getMember_phone());
            pstmt.setString(4, newMember.getBook_rental_list());
            insertCount = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return insertCount;
    }



    public ArrayList<Member> selectMemberList() {
        ArrayList<Member> memberList = null;
        Member member = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM member";

        try{
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                memberList = new ArrayList<Member>();

                do {
                    member = new Member(
                            rs.getInt("member_no"),
                            rs.getString("member_name"),
                            rs.getString("member_phone"),
                            rs.getString("book_rental_list"));
                    memberList.add(member);
                } while (rs.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        close(rs);
        close(pstmt);
        }
        return memberList;
    }

    public Member selectMember(int member_no) {
        Member member = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM member where member_no = ?";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, member_no);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                member = new Member(
                        rs.getInt("member_no"),
                        rs.getString("member_name"),
                        rs.getString("member_phone"),
                        rs.getString("book_rental_list")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            close(rs);
            close(pstmt);
        }
        return member;
    }

    public ArrayList<Member> selectMemberByMember_no(int member_no) {
        ArrayList<Member> searchMemberList = null;
        Member searchMember = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM member WHERE member_no like concat(?, '%')";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, member_no);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                searchMemberList = new ArrayList<Member>();

                do {
                    searchMember = new Member(
                            rs.getInt("member_no"),
                            rs.getString("member_name"),
                            rs.getString("member_phone"),
                            rs.getString("book_rental_list")
                    );
                    searchMemberList.add(searchMember);

                } while (rs.next());
            }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return searchMemberList;
    }

public ArrayList<Member> selectMemberListByMember_name(String member_name) {
    ArrayList<Member> searchMemberList = null;
    Member searchMember = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM member WHERE member_name like concat('%', ?, '%')";

    try{
        pstmt = con.prepareStatement(sql);

        pstmt.setString(1, member_name);
        rs = pstmt.executeQuery();

        if(rs.next()) {
            searchMemberList = new ArrayList<Member>();

            do{
                searchMember = new Member(
                        rs.getInt("member_no"),
                        rs.getString("member_name"),
                        rs.getString("member_phone"),
                        rs.getString("book_rental_list"));

                        searchMemberList.add(searchMember);
            } while(rs.next());
        }

    } catch (Exception e) {
        e.printStackTrace();;
    } finally {
        close(rs);
        close(pstmt);
    }
    return searchMemberList;
}



public int deleteMember(int member_no) {
        int deleteCount = 0;
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM member WHERE member_no = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, member_no);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
    return deleteCount;
}


    public int updateMember(Member changeMember) throws Exception{

        int updateCount = 0;
        PreparedStatement pstmt = null;
        String sql = "UPDATE member SET member_name=?, member_phone=? WHERE member_no=?;";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, changeMember.getMember_name());
            pstmt.setString(2, changeMember.getMember_phone());
            pstmt.setInt(3, changeMember.getMember_no());

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




    public int updateMember_rental(Member changeMember) throws Exception{

        int updateCount = 0;
        PreparedStatement pstmt = null;
        String sql = "UPDATE member SET book_rental_list=? WHERE member_no=?;";

        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, changeMember.getBook_rental_list());
            pstmt.setInt(2, changeMember.getMember_no());
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




}//MemberDAO class end
