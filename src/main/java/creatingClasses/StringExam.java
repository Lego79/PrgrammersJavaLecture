package creatingClasses;

public class StringExam {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2) // 같은 영역을 가르키고 있는지
            System.out.println("str1,st2,는 같은레퍼런스");

        if (str3 != str4) // 같은 영역을 가르키고 있는지
            System.out.println("str1,st2,는 같은레퍼런스");

        System.out.println(str1.substring(3));

        String str5 = new String("Hello world");
        String str6 = new String("Hello world");

        if (str5 == str6) {
            System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
        } else {
            System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");

        }

    }
}

