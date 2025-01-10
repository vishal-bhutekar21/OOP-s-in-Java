import java.util.*;
class StringExample{
    
        static String Greet(String s){
            String greet;
            greet="Hello this is :"+s;

            return greet;
        }



public static void main(String s[]){

    System.out.println("Hello this is vishal ");

    Scanner in=new Scanner(System.in);

    System.out.println("Enter you Name to welcome in our Software :");

    String sx=in.nextLine();

    System.out.println(Greet(sx));   



}




}