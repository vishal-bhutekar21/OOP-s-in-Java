public class EvenDigitsCount {



    public static void main(String ...s){
        
    }
    
        public int findNumbers(int[] nums) {
            int count = 0; // To store the count of numbers with even digits
    
            // Loop through each number in the array
            for (int num : nums) {
                if (isEven(num)) { // Check if the number has an even number of digits
                    count++;
                }
            }
    
            return count; // Return the total count
        }
    
        // Helper method to check if a number has an even number of digits
        private boolean isEven(int num) {
            int digitCount = 0;
    
            // Count the number of digits in the number
            while (num > 0) {
                digitCount++;
                num /= 10;
            }
    
            // Return true if the number of digits is even
            return digitCount % 2 == 0;
        }


        

}
