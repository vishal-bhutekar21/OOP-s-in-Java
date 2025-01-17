public class Pen {
    
    String s ="this is the String from the Pen class";

    public void PrintColor(){
        System.out.println("Hello this is paint from the Pen class");


    }
     void theColor()
    {
        System.out.println(this.s);
    }

    public static void main(String[] args) {
        Pen p1=new  Pen();
        p1.PrintColor();
        p1.s="this is p1 objest variable";

        p1.theColor();
        p1.PrintColor();


    }
}
