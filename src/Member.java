/*
import java.util.ArrayList;
import java.util.List;


public class  Member {

    int selectNo;
    PrintScan p = new PrintScan();
    MemberVo member = new MemberVo();
    List<MemberVo> memberList = new ArrayList<MemberVo>();
    BookController_befor book = new BookController_befor();


    public Member() {
    } //기본 생성자




    public void memberLookup() { //회원조회
        p.mainMenu(2);
        selectNo = p.getInt("메뉴입력 >>");
        if (selectNo == 1) { //1.모든 회원보기
            p.getString("［ 전체 회원 목록 ］");
            for (int i = 0; i < memberList.size(); i++) {
                p.getString(memberList.get(i).toString());
                book.showMain();
            }
        } else if (selectNo == 2) { //2.책 번호로 찾기
            String selectName = p.getString("검색할 회원 이름 입력 >> ");
            for (int i = 0; i < memberList.size(); i++) {
                if (selectName.equals(memberList.get(i).getName())) {
                    p.getString(memberList.get(i).toString());
                    break;
                }
            }
        }  else {
            p.print("잘못입력하셨습니다. 다시 진행해주세요.\n");
            memberLookup();
        }
    }

    public void serchMember(String member) {
        p.print("회원검색중입니다.\n");
        for (int i = 0; i < memberList.size(); i++) {
            if (member.equals(memberList.get(i).getName())) {
                p.print("있는 회원 ㅇㅋ");
            } else {
                p.print("없는 회원ㅡㅡ");
            }            
        }
        p.print("회원검색완료.");
    }






}//class end
*/
