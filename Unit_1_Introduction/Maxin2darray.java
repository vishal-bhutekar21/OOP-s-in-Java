import java.util.Arrays;

public class Maxin2darray {
    public static void main(String[] args) {
     
    int [][]arr={
        {12,13,14,15,16},
        {21,22,23,24,25,26},
        {31,32,33,34,35}
    };

        


   int result=max(arr);
    System.out.println(result);

    
    } 
    static int max(int[][] arr){


        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                if(arr[row][col]>max ){

                    max=arr[row][col];
                }
            
            
            
            
            } 
            
        }
        return max;
    }
}
