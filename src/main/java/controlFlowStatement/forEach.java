package controlFlowStatement;

public class forEach {

    public static void main(String[] args) {
        int[] iarr = {10, 20, 30 ,40 ,50};

        for(int i = 0; i < iarr.length; i++) {
            int value = iarr[i];
            System.out.println("value = " + value);
        }

        for(int value :iarr) { // : 구분으로 두가지의 값, : 뒤에는 반복되는 자료구조, 출력하고 싶은 자료구조, iarr 자료구조가 있다
                               // : 받아낼 변수는 : 앞쪽에 변수를 선언
            System.out.println("value = " + value);
        }


    }

}
