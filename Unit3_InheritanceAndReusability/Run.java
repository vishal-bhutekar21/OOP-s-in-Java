abstract class main2{

    abstract void runcar();
}

class Run2 extends main2{

   void runcar(){
        System.out.println("this is run from the Run2");
    }

}

class Run{
    public static void main(String[] args) {
        
        Run2 r;
        r=new Run2();
        r.runcar();

    
        
    }
}