import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book bookadd1 = new Book(4, "최소한의 이웃", "허지웅");

        System.out.println(bookadd1);

        ShowMain mainMenu = new ShowMain();
        mainMenu.mainMenu();

        Scanner scan = new Scanner(System.in);
        boolean cho = true;
        int u_cho = scan.nextInt();


    }
}
