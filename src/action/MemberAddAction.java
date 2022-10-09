package action;

import svn.BookAddService;
import svn.MemberAddService;
import util.ConsoleUtil;
import vo.Book;
import vo.Member;

import java.util.Scanner;

public class MemberAddAction implements Action{

    ConsoleUtil consoleUtil = new ConsoleUtil();
    MemberAddService memberAddservice = new MemberAddService();

    @Override
    public void execute(Scanner sc) throws Exception {
       int member_no = consoleUtil.getMember_no("",sc);
       boolean isRegisted = memberAddservice.searchMember(member_no);

       if(isRegisted) {
           consoleUtil.printRegistedBook(member_no);
           return;
       }

       Member newMember = consoleUtil.getNewMember(member_no, sc);

       boolean isRegistMember = memberAddservice.registMember(newMember);
       if(isRegistMember) consoleUtil.printRegistSucess(newMember);
       else consoleUtil.printRegistFail(newMember);

    }
}
