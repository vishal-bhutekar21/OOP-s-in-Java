import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        

        int arr[] = {12, 3, 42, 353, 45, 645, 64, 232};

    
        System.out.println("The array is: " + Arrays.toString(arr));
        
        
        int key;
        System.out.println("enter the key:");
        key=in.nextInt();

        int result = linear(arr, key);

       
        if (result != -1) {
            System.out.println("The key " + key + " is found at index: " + result);
        } else {
            System.out.println("The key " + key + " is not found in the array.");
        }
    }

   
    static int linear(int[] arr, int key) {
      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
}
