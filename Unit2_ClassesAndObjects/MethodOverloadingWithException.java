import java.util.Scanner;

class VishalNumberException extends Exception {
    public VishalNumberException(String message) {
        super(message);
    }
}

class MethodOverloadingWithException {

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    static double sum(double a, double b, double c) {
        return (a + b + c);
    }

    static double sum(double a, double b) {
        return (a + b);
    }

    static void validateNumber(double num) throws VishalNumberException {
        if (num <= 0) {
            throw new VishalNumberException("Number must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers (a and b): ");
            int a = in.nextInt();
            int b = in.nextInt();
            validateNumber(a);
            validateNumber(b);
            System.out.println("The addition of two integer numbers is: " + sum(a, b));

            System.out.println("Enter three numbers (c, d, and e): ");
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            validateNumber(c);
            validateNumber(d);
            validateNumber(e);
            System.out.println("The addition of three integer numbers is: " + sum(c, d, e));

            System.out.println("Enter two double numbers to find their sum:");
            double aa = in.nextDouble();
            double bb = in.nextDouble();
            validateNumber(aa);
            validateNumber(bb);
            System.out.println("The sum of the two double values is: " + sum(aa, bb));

        } catch (VishalNumberException ex) {
            System.out.println("InvalidNumberException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("System-defined exception: " + ex.getMessage());
        } finally {
            in.close();
            System.out.println("Execution completed.");
        }
    }
}
