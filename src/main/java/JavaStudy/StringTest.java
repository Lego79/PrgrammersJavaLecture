package JavaStudy;

public class StringTest {



    public static void main(String[] args) {

//        String sub = "자바 프로그래밍 개어려워";
//        String bub = "자바 프로그래밍 개어려워";
//        int length = sub.length();
//
//        System.out.println("length = " + length);
//
//        for(int i = 0; i <= length; i ++) {
//            System.out.println(i);
//        }
//
//        boolean result = sub.equals(bub);
//
//        System.out.println(result);

        String id = "123456-1234567";

        String firstNum = id.substring(0,6);
        String secondNum = id.substring(7);

        System.out.println("secondNum = " + firstNum + "secondNum = " + secondNum);
        System.out.println(id);


    }

}
