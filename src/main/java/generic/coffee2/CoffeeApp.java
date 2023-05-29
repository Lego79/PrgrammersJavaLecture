package generic.coffee2;

public class CoffeeApp {

    public static void main(String[] args) {


        Coffee coffee = new Coffee("Americano", 3500,"Kenya");
        Box<Coffee> box1 = new Box<Coffee>(coffee);

        Coffee coffee2 = box1.getData();

        coffee2.printInfo();

    }


}
