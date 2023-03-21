package TwelveHoursJavaCourse;

import java.util.Scanner;

public class GamePractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) { //두조건 다 상관 없음
            System.out.println("you quit the game");
        }

        else  {
            System.out.println("You are still playing the game *pew pew*");
        }

    }

}
