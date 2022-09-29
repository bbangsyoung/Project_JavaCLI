public class Main {
    public static void main(String[] args) {
        try {
            BookController book = new BookController();
            book.showMain();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}