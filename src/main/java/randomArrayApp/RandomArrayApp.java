package randomArrayApp;

public class RandomArrayApp {

    public static void main(String[] args) {

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 45) + 1;
        }

        // Print the generated array
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
