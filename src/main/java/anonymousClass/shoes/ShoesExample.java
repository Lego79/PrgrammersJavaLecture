package anonymousClass.shoes;

public class ShoesExample {

    public static void main(String[] args) {


        Shoes shoes = new Shoes();

        shoes.wearing1();

        shoes.wearing2();

        shoes.wearing3(new Brand(){

            @Override
            public void wear(){

                System.out.println("익명객체 3이 신발을 신습니다");

            }

        });


    }
}
