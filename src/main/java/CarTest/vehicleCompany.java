package CarTest;

public class vehicleCompany {

    public static void main(String[] args) {

        Bus bus1 = new Bus();

//        Car car1 = new Bus();
//
//        bus1.setSpeed(99);

       bus1.Car(100, 4);

       int speed = bus1.getSpeed();
       int wheel = bus1.getWheel();



        System.out.println(speed + wheel);


    }

}
