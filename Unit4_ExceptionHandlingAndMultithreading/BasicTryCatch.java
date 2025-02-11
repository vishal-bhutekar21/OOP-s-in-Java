import java.util.Scanner;

public class BasicTryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = in.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            in.close();
            System.out.println("Execution completed.");
        }
    }
}
