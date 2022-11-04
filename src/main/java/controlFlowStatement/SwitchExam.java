package SwitchPractice;

public class SwitchExam {

    public static void main(String[] args) {
        //switch, case, default, break

        int value = 2;

        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그외 다른 숫자");
        } // case 성질은 만난 케이스부터 나머지를 모두 출력한다, 2로 바꾸면 2부터 3, 그외 다른숫자가 나오는 것
        //break를 사용하면 만나야 하는 케이스를 만났을 대 밖으로 빠져 나오게 된다

        String str = "A";
        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":

        }

    }

}
