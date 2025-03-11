abstract class student{

    int data;


    abstract void getdetails();
    void display(){
        System.out.println("simple display method in class student");
    }


}

class ganga extends student{
    void getdetails() {
        System.out.println("this is details of Aniket");
        System.out.println("Aniket is upcoming preseident of geca");
    }
    void display(){
        System.out.println("this is details of gangaprasad urekar from the ganga class ");
    }

}
class Vishal extends student{
    void getdetails(){
        System.out.println("this is details of Vishal");
    }

}



class Aniket extends student {
    void getdetails() {
        System.out.println("this is details of Aniket");
        System.out.println("Aniket is upcoming preseident of geca");
    }
}



public class StudentAbstract {

   public static void main(String[] args) {
    student s;
    s=new ganga();
    s.display();

    // s=new Vishal();

    // s.getdetails();
    // s=new Aniket();
    // s.getdetails();
    


   }



    

    
}
