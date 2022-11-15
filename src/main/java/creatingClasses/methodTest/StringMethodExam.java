package creatingClasses.methodTest;

public class StringMethodExam {

    public static void main(String[] args) {

        String str = "hello";
        str.length();
        System.out.println("str = " + str.length());
        System.out.println(str.concat(" world"));

        System.out.println("str.substring(3) = " + str.substring(3));

    }

}
