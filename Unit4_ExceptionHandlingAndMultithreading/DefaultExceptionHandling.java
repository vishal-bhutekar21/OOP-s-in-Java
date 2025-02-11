import java.util.Scanner;
import java.util.InputMismatchException;

public class DefaultExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int num = in.nextInt(); 
            
            System.out.println("enter number to divide the num1 :");
            int num2=in.nextInt();
            int result = num / num2;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero."+e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer."+e.getMessage());
        } finally {
            in.close(); 
            System.out.println("Execution completed.");
        }
    }
}
