package action;
import svn.RentalSerchSearvice;
import util.ConsoleUtil;
import vo.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class RentalAction implements Action{
    ConsoleUtil consoleUtil = new ConsoleUtil();
    RentalSerchSearvice rentalSerchService = new RentalSerchSearvice();

    @Override
    public void execute(Scanner sc) throws Exception {

        ArrayList<Book> searchBookList = null;


        int book_no = consoleUtil.getBook_no("대여반납할 책넘버➥",sc);
        searchBookList = rentalSerchService.getSearchBookListByBook_no(book_no);

        if(searchBookList != null) {
            consoleUtil.printBookList_rental(searchBookList);
            System.out.println("현재 있는 책이군...");


            int book_no_rental = consoleUtil.getBook_no("다시 한번 입력해주세요 ", sc);
            Book modifyBook = RentalSerchSearvice.getModifyBook_rental(book_no_rental);
            Book changeBook = consoleUtil.getChangeBook_rental(modifyBook, sc);

            boolean isModifySuccess = RentalSerchSearvice.modifyBook_rental(changeBook);

            if(isModifySuccess) {
                consoleUtil.printModifySuccess(book_no);
            } else {
                consoleUtil.printModifyFail(book_no);
            }


        } else {
            consoleUtil.printSearchBookListNotFound();
        }











    }
}
