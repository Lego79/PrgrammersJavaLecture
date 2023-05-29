package anonymousClass;

public class CarExample {

    public static void main(String[] args) {

        Car car = new Car();
        car.run1();

        car.run2();

        car.run3(new Tire(){
            public void roll(){
                System.out.println("익명자식 타이어 객체 3이 굴러갑니다");
            }
        });


    }

}
