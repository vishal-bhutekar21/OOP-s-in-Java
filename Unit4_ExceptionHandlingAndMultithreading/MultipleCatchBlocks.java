import java.util.Scanner;
import java.util.InputMismatchException; // Import the correct exception class

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = in.nextInt();
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: Cannot divide by zero.");
        } catch (InputMismatchException e) {  // Handle the correct exception
            System.out.println("InputMismatchException occurred: Please enter a valid integer.");
        } catch (IllegalArgumentException e) {  // Handle the custom exception
            System.out.println(e.getMessage());
        } finally {
            in.close();
            System.out.println("Execution completed.");
        }
    }
}
