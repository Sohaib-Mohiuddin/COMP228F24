package WeekFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningExceptions {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first value: ");
            double numOne = scanner.nextDouble();

            System.out.print("Enter the second value: ");
            double numTwo = scanner.nextDouble();

            double sum = numOne + numTwo;
            System.out.println("The sum is: " + sum);

            scanner.close();
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid Input. Only valid integer or decimal values allowed.");
        } catch (InputMismatchException ime) {
            System.out.println("Input Mismatch Error: " + ime.getLocalizedMessage());
        } catch (IllegalArgumentException ile) {
            System.out.println("Illegal Argument Error: " + ile.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

    }
}
