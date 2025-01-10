public class SwapFunction {
    

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;



              
        
    }
    public static void main(String[] args) {
        
        int a=10;
        int b=20;

       




        System.out.println("The value of the A is : "+a);
        System.out.println("The value of the B is : "+b);

        swap(a,b);// this code will not change the values of the actual a and b
               System.out.println("The value of the A is : "+a);
        System.out.println("The value of the B is : "+b);
    }
}
