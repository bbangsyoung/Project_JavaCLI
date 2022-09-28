public class Main {
    public static void main(String[] args) {
        try {
            Book book = new Book();
            book.showMain();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}