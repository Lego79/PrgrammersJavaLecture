package controlFlowStatement;

public class WhilePractice {

    public static void main(String[] args) {
//        int i = 0;


        //i가 10보다 작을 때 까지 계속 동작하는 것

//        while(i < 10) { //이상태로만 실행하면 무한루프프
//
//            System.out.println("i = " + i);
//
//            i++;


        int total = 0; //1부터 100까지 합을 구하고 싶다, 그릇을 생성
        int i = 1;

        while (i <= 100) {

            total = total + i;
            i++;


        }

        System.out.println(total);

    }

}
