package creatingClasses.methodTest;

public class MethodExam {

    // 입력삽 : 매개변수, 인자 - 결과값 : 리턴값
    //매개변수 - 파라미터 : 전달된 인자를 받아들이는 변수를 의미
    //인자 - 아규먼트 : 어떤 함수를 호출시에 전달되는 값을 의미

    //public 리턴타입 메소드명 (매개변수들) {구현}

    public void method1(){
        System.out.println("m1이 실행됨..");
    }

   public void  method2(int x) {
       System.out.println(x + "를 이용한 m2실행");

   }

   public int method3() {
       System.out.println("m3실행");
       return 10;
   }

   public void method4(int x, int y) {
       System.out.println(x + y + "method4 실행");


   }

   public int method5(int y) {
        System.out.println(y + "이용한 m5실행");

        return y * 8;
    }


}
