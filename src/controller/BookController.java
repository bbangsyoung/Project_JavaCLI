package controller;
import action.Action;
import java.util.Scanner;

public class BookController {

    public void requestProcess(Action action, Scanner sc) {
        //다형성을 이용해 action 변수가 실질적으로 참조하고 있는 Action 클래스 객체의 execute 메소드를 호출하여 요청을 처리
        try{
            action.execute(sc);
        }
        catch(Exception e){
            e.printStackTrace(); //에러발생시, 발생근원지를 찾아 단계별로 에러출력 요청을 하는 메서드.
        }
    }
}
