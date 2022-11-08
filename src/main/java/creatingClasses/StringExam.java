package creatingClasses;

public class StringExam {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2) // 같은 영역을 가르키고 있는지
            System.out.println("str1,st2,는 같은레퍼런스");

        if(str3 != str4) // 같은 영역을 가르키고 있는지
            System.out.println("str1,st2,는 같은레퍼런스");

        System.out.println(str1.substring(3));

    }

}
