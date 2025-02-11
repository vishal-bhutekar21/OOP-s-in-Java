import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter any integer value :");
        int num=in.nextInt();
        System.out.println("The number value is :"+num);

        double d1= num;
        System.out.println(" upcasting is :"+d1);


        

    }
    
}