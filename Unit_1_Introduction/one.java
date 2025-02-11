class MultithreadingExample {
    
    public static void main(String[] args) {
         class one extends Thread{

            public void run()
            {
                for (int i = 0; i < 100; i++) {
                    
                    System.out.println("The thread one is :"+i);
                }
            }
            
        }
        
    }
    
}

