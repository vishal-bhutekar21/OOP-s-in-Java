public class function_overloading {
    public String sum(String a ,String b){
        return a+b;
    }
    
    // public double sum(double a ,double b){
    //     return a+b;
    // }

    public static void main(String s[]){
        function_overloading f1=new function_overloading();
        System.err.println(f1.sum("786","342"));
    }
}
