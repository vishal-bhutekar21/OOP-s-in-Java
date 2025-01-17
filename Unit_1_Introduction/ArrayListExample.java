
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

  

    public static void main(String[] args) {
           Scanner in =new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
         
    list.add(20);
    System.out.println(list);
    System.out.println(list.contains(20));// if it contains then it returns true otherwise it return false

    System.out.println(list);

    for(int i=0;i<5;i++){
        list.add(in.nextInt());

        System.out.println(list);

        
    }

    for(int i=0;i<5;i++){

            System.out.println(""+list.get(i));
    }


    }
    
}
