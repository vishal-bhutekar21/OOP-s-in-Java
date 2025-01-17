
import java.util.Arrays;

public class Maxitems {
    
    public static void main(String[] args) {
        

        int [] arr={23,42,523,563,22112,634};

        System.out.println("The arrays last element is :"+Arrays.toString(arr));

        System.out.println(max(arr));

    }

    static int max(int arr[]){

        int maxvalue=Integer.MIN_VALUE;
        for(int i= 1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                maxvalue=arr[i];

            }

        }
        return maxvalue;
    }
}
