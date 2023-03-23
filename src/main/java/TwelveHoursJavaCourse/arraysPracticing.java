package TwelveHoursJavaCourse;

public class arraysPracticing {

    public static void main(String[] args) {

//        String [] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
//
//        cars[0] = "Mustang";
//
//
//
//        System.out.println(cars[3]);

//        String [] cars = new String[3];
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        System.out.println(cars[1]);
//
//        for(int i=0; i<cars.length; i++) {
//            System.out.println(cars[i]);

        //2d arrays

        String [][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Silverado";
        cars[1][1] = "Silverado";
        cars[1][2] = "Silverado";

        cars[2][0] = "cl";
        cars[2][1] = "cl";
        cars[2][2] = "cl";



        for(int i = 0; i < cars.length; i++) {



            for(int j=0; j <cars[i].length; j++) {

                System.out.println(cars[i][j] + " ");

            }

        }

    }



}
