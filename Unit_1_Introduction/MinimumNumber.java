public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {12, 23, 5234, 634, 74, 2, 6, 8, -1000};

        System.out.println("The minimum number in the array is: " + min(arr));
    }

    static int min(int[] arr) { 
        int minval = arr[0]; 
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i]; 
            }
        }

        return minval; 
    }

}
