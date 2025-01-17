
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        

        int [] arr={12,42,13,42,52,5254,23,634};

        System.out.println("The array is Before reverse :"+Arrays.toString(arr));

        reverse(arr);
        System.out.println("The array is After reverse :"+Arrays.toString(arr));

        
    }
    static void reverse(int []arr){
       int start=0;
        int end=arr.length-1;


        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }

    static   void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
