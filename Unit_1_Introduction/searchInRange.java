public class searchInRange {
    public static void main(String[] args) {
        
        int arr[]={12,32,363,74,234,63};
        System.out.println(LinearSearch(arr, 32, 1, 3));
        

    }

    static int LinearSearch(int arr[],int target,int start,int end){

        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index< arr.length; index++) {

            int element=arr[index];

            if(element==target){
                return index;
            }


        }
        return -1;

    }
}
