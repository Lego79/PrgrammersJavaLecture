package creatingClasses;

public class carExam {

    public static void main(String[] args) {


        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "경찰차";
        c1.number = 3324;

        c2.name = "차차";
        c2.number = 1132;

        System.out.println("c2 = " + c2);
        System.out.println("c2 = " + c1);

    }

}
