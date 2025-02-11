import java.util.Scanner;

class MethodOverloading{


    static int sum(int a,int b){
            return(a+b);
            
    
        }
    
        static int sum(int a,int b,int c){
            return (a+b+c);
    
        }
    
       static  double sum(double a,double b){
            return(a+b);
        }

        static  float sum(float a,float b){
            return(a+b);
        }

        public static void main(String[] args) {
        
            Scanner in =new Scanner(System.in);
        
            System.out.println("Enter two numbers (a and b): ");
            int a = in.nextInt();
            int b = in.nextInt();
    
            System.out.println("The addition of two INteger numbers is :"+sum(a,b));

            System.out.println("Enter Three  numbers (c and d and e): ");
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();

            System.out.println("The addition of Three INteger numbers is :"+sum(c,d,e));

           
            System.out.println("Enter any to double number to find the sum of the double numbers:");
            
            double aa,bb;
    
            aa=in.nextDouble();
            bb=in.nextDouble();
            System.out.println("The sum of the two double values is :"+sum(aa,bb));

            System.out.println("Enter any to float number to find the sum of the double numbers:");
            
            float dd,ee;
    
            dd=in.nextFloat();
            ee=in.nextFloat();
            System.out.println("The sum of the two Float values is :"+sum(dd,ee));


            in.close();
    }
}