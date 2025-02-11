import java.security.spec.ECFieldF2m;
import java.util.logging.Handler;


class MultithreadingExample {

    public static void main(String[] args) {

        One a1 = new One();
        Two b = new Two();
        Three c = new Three();
        Four d = new Four();

       
        try  {
            
                  c.start();

                  Threadwait();
                      
                   } catch (Exception e) {
                       System.out.println(e.getMessage());
                   }
           
                  
                  
                  
               }
           
               static void Threadwait()
               { 
                
                try{

                    for (int i = 0; i < 100; i++) {
                        System.out.println("Seconds :"+i+1);
                        
                    }
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                   
               }
}

class One extends Thread {

    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Thread One is: " + i);
        }
    }
}

class Four extends Thread {

    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Thread Four is: " + i);
        }
    }
}

class Three extends Thread {

    
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Thread Three is: " + i);
        }
    }
}

class Two extends Thread {

    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Thread Two is: " + i);
        }
    }

    
}

    


