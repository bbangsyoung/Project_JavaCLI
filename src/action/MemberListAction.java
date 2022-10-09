package action;

import svn.BookListService;
import svn.MemberListService;
import util.ConsoleUtil;
import vo.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberListAction implements Action {

    ConsoleUtil consoleUtil = new ConsoleUtil();
    MemberListService memberListService = new MemberListService();

    @Override
    public void execute(Scanner sc) throws Exception {
        ConsoleUtil consoleUtil1 = new ConsoleUtil();
        ArrayList<Member> memberList = memberListService.getMemberList();

        if(memberList != null) {
            consoleUtil.printMemberList(memberList);
        } else {
            consoleUtil.printMemberListNotFound();
        }



    }
}
