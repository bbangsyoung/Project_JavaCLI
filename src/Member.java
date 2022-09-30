import vo.MemberVo;
import java.util.ArrayList;
import java.util.List;


public class  Member {

    int selectNo;
    PrintScan p = new PrintScan();
    MemberVo member = new MemberVo();
    List<MemberVo> memberList = new ArrayList<MemberVo>();
    BookController book = new BookController();


    public Member() {
    } //기본 생성자

    public void memberAdd() { //회원등록
        p.print("회원등록을 시작합니다.");
        member.setId(p.getString("등록할 계정입력 > "));
        member.setPw(p.getString("패스워드입력 > "));
        member.setName(p.getString("이름 입력 > "));
        //member.setbookrental("대여목록 없음");

        p.print("――――――――――――――――――――\n");
        p.print("ID: " + member.getId() + ", PW: " + member.getPw() + ", 이름: " + member.getName() +"\n");
        p.print("――――――――――――――――――――\n");
        selectNo = p.getInt("위 내용이 맞습니까? 맞으면 1, 틀릴 시 2\n");

        if (selectNo == 1) {
            memberList.add(member);
            p.print("회원등록 완료 / 조회로 넘어간다\n");
            book.showMain();
        } else if (selectNo == 2)
            p.print("회원등록 실패\n");
    }


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
