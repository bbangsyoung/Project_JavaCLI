package action;

import controller.BookController;
import svn.MemberSerchSearvice;
import util.ConsoleUtil;
import vo.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSearchAction implements Action{
    ConsoleUtil consoleUtil = new ConsoleUtil();
    MemberSerchSearvice memberSerchService = new MemberSerchSearvice();

    @Override
    public void execute(Scanner sc) throws Exception {
        int searchMenuNum_member = consoleUtil.getSearchMenuNum_member(sc);
        ArrayList<Member> searchMemberList = null;

        if(searchMenuNum_member == 1) {
            String member_name = consoleUtil.getMember_name("➥",sc);
            searchMemberList = memberSerchService.getSearchMemberListByMember_name(member_name);

        } else if (searchMenuNum_member == 2) {
            int member_no = consoleUtil.getMember_no("➥", sc);
            searchMemberList = memberSerchService.getSearchMemberListByMember_no(member_no);
        }  else if (searchMenuNum_member == 4) {
            consoleUtil.printSearchMemberCancel();
            return;
        } else {
            consoleUtil.printSearchMenuWrong();
            Action action = new MemberSearchAction();
            BookController bookController = new BookController();
            bookController.requestProcess(action, sc);
            return;
        }


        if(searchMemberList != null) {
            consoleUtil.printMemberList(searchMemberList);
        } else {
            consoleUtil.printSearchMemberListNotFound();
        }


    }
}
