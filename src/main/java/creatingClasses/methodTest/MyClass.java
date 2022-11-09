package creatingClasses.methodTest;

public class MyClass {
    public static void main(String[] args) {


        MethodExam myClass = new MethodExam();
        myClass.method1();
        myClass.method2(10);

        int value = myClass.method3();
        System.out.println("method3이출력한값" + value);

        int value2 = myClass.method5(55);
        System.out.println("메서드 실행값은 = " + value2);

    }



}
