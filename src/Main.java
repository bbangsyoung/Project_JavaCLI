public class Main {
    public static void main(String[] args) {

        try {
            BookManageController book = new BookManageController();
            book.mainMenu();
        }catch (Exception e){
            e.getStackTrace();
        }
    }


}