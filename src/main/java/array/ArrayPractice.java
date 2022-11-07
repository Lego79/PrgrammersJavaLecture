package array;

public class ArrayPractice {

    public static void main(String[] args) {
        //타입을 정하자, 학생이 100명 있다

        int[] array1 = new int[100]; //배열은 처음에 생성한 범위가 바뀌지 않음
        int[] array2 = new int[]{1, 2, 3, 4};

        int[] array3 = { 1, 2, 3, 4};

        array1[0] = 100;
        array1[10] = 200;

        System.out.println(array3[3]);
        int value = array3[0];

        System.out.println("value = " + value);





    }

}
