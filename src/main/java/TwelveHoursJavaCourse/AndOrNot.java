package TwelveHoursJavaCourse;

public class AndOrNot {

    public static void main(String[] args) {

        //&& both conditions must be true
        //|| either condition must be true
        //! reverses boolean value of condition

        int temp = 5;

        if(temp>30) {

            System.out.println("It is hot outside");

        } else if (temp>= 20 && temp <=30) {

            System.out.println("It is warm outside");

        }

        else {

            System.out.println("it is cold outside");
        }


    }

}
