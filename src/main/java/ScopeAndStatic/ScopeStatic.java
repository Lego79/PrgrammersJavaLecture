package ScopeAndStatic;

public class ScopeStatic {

    static int globalScope = 10;
    static int staticVal = 20;

    public void scopeTest(int value) {
        int localScope = 20;


        System.out.println("localScope = " + localScope);
        System.out.println("globalScope = " + globalScope);
        System.out.println(value);
    }

    public void  scopeTest2(int value2){
        System.out.println("globalScope = " + globalScope);
//        System.out.println("localScope = " + localScope);
//        System.out.println(value);
          System.out.println(value2);
    }

    public static void main(String[] args) {
//        System.out.println("localScope = " + localScope);
//        System.out.println("globalScope = " + globalScope);
//        System.out.println(value);
        System.out.println(staticVal);



        //객체를 생성하고 만드는 방버



    }


}
