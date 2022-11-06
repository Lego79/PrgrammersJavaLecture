package controlFlowStatement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        //do while은 무조건 한번을 실행함
        int value = 0;
        Scanner scan = new Scanner(System.in); //키보드,로부터 값을 입력 받는 클래스, 자바가 제공

        do {
            //반복할 문장을
            //10이 아닌 숫자가 들어왔을 때

            value = scan.nextInt();
            System.out.println("입력받은 값:" + value);

        } while(value != 10); //while에 있는 조건을 만족 할때만

        System.out.println("반복문 종료!!");

    }


}
