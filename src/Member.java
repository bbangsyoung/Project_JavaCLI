import VO.MemberVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

    Scanner scan = new Scanner(System.in);
    List<MemberVo> memberList = new ArrayList<MemberVo>();

    public Member() { } //기본생성자

    public void memberadd() throws Exception{

        MemberVo member = new MemberVo();
        System.out.println("회원등록을 시작합니다.");

        System.out.println("등록할 계정입력");
        member.setId(scan.nextLine());

        System.out.println("패스워드 입력");
        member.setPw(scan.nextLine());
        member.setBookrental("대여목록 없음");


        System.out.println("----------------------------");
        System.out.println(member.getId() + "," + member.getPw());
        System.out.println("----------------------------");
        System.out.println("위 내용이 맞습니까? 맞으면 1, 틀릴 시 2");
        int select = scan.nextInt();
        if (select == 1) {
            memberList.add(member);
            System.out.println("회원등록을 완료하였습니다.");
        } else if (select == 2)
            System.out.println("회원등록을 실패하였습니다.");

        BookManageController book = new BookManageController();
        book.mainMenu();
    }







}
