import Vo.BookVo;
import Vo.MemberVo;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


public class Member {

    int selectNo;
    PrintScan p = new PrintScan();
    MemberVo member = new MemberVo();
    List<MemberVo> memberList = new ArrayList<MemberVo>();

    Member() {
    } //생성자초기화

    public void memberAdd() { //회원등록
        p.print("회원등록을 시작합니다.");
        member.setId(p.getString("등록할 계정입력"));
        member.setPw(p.getString("패스워드입력"));
        member.setName(p.getString("이름 입력"));
        member.setbookrental("대여목록 없음");

        p.print("――――――――――――――――――――");
        p.print("ID: " + member.getId() + ", PW: " + member.getPw() + ", 이름: " + member.getName());
        p.print("――――――――――――――――――――");
        selectNo = p.getInt("위 내용이 맞습니까? 맞으면 1, 틀릴 시 2");

        if (selectNo == 1) {
            memberList.add(member);
            p.print("회원등록 완료 / 조회로 넘어간다");
            memberLookup();
        } else if (selectNo == 2)
            p.print("회원등록 실패");
    }


    public void memberLookup() { //회원조회
        p.mainMenu(3);
        selectNo = p.getInt("메뉴입력 >>");

        if (selectNo == 1) { //1.모든 회원보기
            p.getString("［ 전체 회원 목록 ］");
            for (int i = 0; i < memberList.size(); i++) {
                p.getString(memberList.get(i).toString());
                break;
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
            p.print("잘못입력하셨습니다. 다시 진행해주세요.");
            memberLookup();
        }
    }






}//class end
