package controller;
import action.Action;
import java.util.Scanner;

public class BookController {
    public void requestProcess(Action action, Scanner sc) {
        try{
            action.execute(sc);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
