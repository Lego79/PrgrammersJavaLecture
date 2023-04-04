package TwelveHoursJavaCourse;

public class PowerCell {

    public static void main(String[] args) {

        int age = 75;
        if(age == 75) {
            System.out.println("ok Boomer!");
        }
        // 첫번째 조건이 맞으면 나머지는 다 무시해버린다!

        //one by one으로 하나씩 체크한다

        else if (age >= 18) {

            System.out.println("you are an adult");

        }

        else if(age>=13) {
            System.out.println("you are a teenager!");
        }

        else {
            System.out.println("you are not an adult");
        }

    }

}
