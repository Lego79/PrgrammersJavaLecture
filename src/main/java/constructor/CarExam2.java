package constructor;

public class CarExam2 {

    public static void main(String[] args) {

        CarCar c1 = new CarCar("power");
        CarCar c2 = new CarCar("power2");

        System.out.println(c1.name);

        class Person{
            int age;

            Person(int number) { age = number;}
        }

    }

}
