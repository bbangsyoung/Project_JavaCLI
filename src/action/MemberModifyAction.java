package action;

import svn.MemberModifyService;
import util.ConsoleUtil;
import vo.Book;
import vo.Member;

import java.util.Scanner;

public class MemberModifyAction implements Action {

    ConsoleUtil consoleUtil = new ConsoleUtil();
    MemberModifyService memberModifyService = new MemberModifyService();

    @Override
    public void execute(Scanner sc) throws Exception {

        int member_no = consoleUtil.getMember_no("수정하시겠습니까? ", sc);
        Member modifyMember = memberModifyService.getModifyMember(member_no);

        Member changeMember = consoleUtil.getChangeMember(modifyMember, sc);

        boolean isModifySuccess = memberModifyService.modifyMember(changeMember);

        if(isModifySuccess) {
            consoleUtil.printModifySuccess(member_no);
        } else {
            consoleUtil.printModifyFail(member_no);
        }

    }
}
