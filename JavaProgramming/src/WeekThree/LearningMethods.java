package WeekThree; // Name of package

// Importing classes or libraries
import java.util.Scanner;

public class LearningMethods {
    /**
     * This method takes two integer values and returns the addition
     * of both values
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public static int addNums(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return num1 * num2
     */
    public static int addNums(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        return x * y;
    }

    public static int addNums(long num1, long num2) {
        return (int)(num1 + num2);
    }
    public static void main(String[] args) {
        String hello = "hello"; // Is this variable available in other methods?

        // Scenario 1: Add integer numbers together.
        Scanner scanner = new Scanner(System.in); // Utilizing Scanner to take user input
        double x = Math.round(scanner.nextDouble()); // First user input: type double
        double y = Math.round(scanner.nextDouble()); // Second user input: type double

        // Output of addNums method
        System.out.println("The method addNums ran and gave: " + addNums((int) x, (int) y));

        // Scenario 2: take 2 string numbers, convert them, Multiply 2 numbers, convert them back, return them
        String xx = "354"; // First value: type String
        String yy = "225"; // Second value: type String

        // Formatted String output with placeholders
        System.out.printf("The multiplication of %s and %s is: %d", xx, yy, addNums(xx, yy));

        scanner.close();
    }
}
