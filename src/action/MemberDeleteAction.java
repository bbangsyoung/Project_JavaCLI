package action;
import svn.MemberDeleteService;
import util.ConsoleUtil;
import vo.Member;

import java.util.Scanner;

public class MemberDeleteAction implements Action{

    ConsoleUtil consoleUtil = new ConsoleUtil();
    MemberDeleteService memberDeleteService = new MemberDeleteService();
    @Override
    public void execute(Scanner sc) throws Exception {

        int member_no = consoleUtil.getMember_no("삭제할 ", sc);
        Member deleteMember = memberDeleteService.getDeleteMember(member_no);

        if(deleteMember == null) {
            consoleUtil.printMemberListNotFound();
            return;
        }

        Boolean isDeleteSuccess = memberDeleteService.DeleteMember(member_no);

        if(isDeleteSuccess) {
            consoleUtil.printDeleteSuccess(member_no);
        } else {
            consoleUtil.printDeleteFail(member_no);
        }





    }
}
