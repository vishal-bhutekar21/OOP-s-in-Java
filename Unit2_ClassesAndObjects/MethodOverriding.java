class Parent{
    void run(){
        System.out.println("HElllo this is from the Parent Class :");
    }
}

 class Child extends Parent {

   public Child()
    {
        super.run();


    }

    void run(){
        System.out.println("Hello this is form Child Class :");
    }

    
}




public class MethodOverriding{
    public static void main(String[] args) {

        Child c1=new Child();

        c1.run();
        
    }
}
