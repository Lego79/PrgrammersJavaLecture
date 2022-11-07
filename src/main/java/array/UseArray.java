package array;

public class UseArray {

    public static void main(String[] args) {


        int[] iarray = new int[100];

        iarray[0] = 1;

        for(int i = 0; i < iarray.length;  i++) {
            iarray[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < iarray.length; i ++ ) {
            //변수의 스코프
            //변수가 선언된 지점,
            sum += iarray[i];
        }
        System.out.println("sum = " + sum);



    }


}
