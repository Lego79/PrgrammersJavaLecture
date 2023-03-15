package TwelveHoursJavaCourse;
import javax.swing.JOptionPane;

public class OperandsAndOperators {

    public static void main(String[] args) {

        //Joptionpane - 값을 묻거나 정보를 알려주는 표준 대화 상자를  쉽게 팝업해서 이용할 수 있게 해줌

        String name =JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are"+ age + "years old");

        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are"+ height + "feet tall");


    }

}
