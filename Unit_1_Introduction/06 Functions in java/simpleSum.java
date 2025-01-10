import java.util.*;

public class simpleSum {

    static int sum(int x,int y){
        return (x+y);
        
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x,y;


        System.out.println("Enter values for x and y :");
        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("The sum is :"+sum(x, y));

        
    }
}