class Parent{
    
    public void show(){
        System.out.println("This is class of parent");
    }

}

public class SonaliFile extends Parent{
    public void show(){
        System.out.println("This is class of Child");
    }
    public static void main(String[] args) {
        
        Child c1=new Child();
        c1.show();
        
        
    }
}
