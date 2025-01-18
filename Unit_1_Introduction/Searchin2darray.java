import java.util.Arrays;

public class Searchin2darray {
    public static void main(String[] args) {
     
    int [][]arr={
        {12,13,14,15,16},
        {21,22,23,24,25,26},
        {31,32,33,34,35}
    };

        int target=33;


   int[] result=search(arr,target);
    System.out.println(Arrays.toString(result));

    
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                if(arr[row][col]==target ){

                    return new int[]{row,col};
                }
            
            
            
            
            } 
            
        }
        return new int[]{-1,-1};
    }
}
