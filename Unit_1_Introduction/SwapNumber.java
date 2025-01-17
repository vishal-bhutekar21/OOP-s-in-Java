
import java.util.Arrays;

public  class SwapNumber {
    
    public static void main(String[] args) {
        int [] arr= {12,23,11,6};
        
        System.out.println("Before swapping the number :"+Arrays.toString(arr));

        swap(arr, 1 , 3);
        System.out.println("After swapping the number :"+Arrays.toString(arr));

            }
        
            static   void swap(int[] arr, int i, int j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
}
