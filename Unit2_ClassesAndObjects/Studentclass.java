public class Studentclass {
    
    String name;
    int age, roll_no;
    float height;

    // Constructor with correct syntax and matching data types
    public Studentclass(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    
    // Method to print student details
    public void printDetails() {
        System.out.println("The Name of the student is: " + this.name);
        System.out.println("The Age of the student is: " + this.age);
        System.out.println("The Height of the student is: " + this.height);

    }

    public static void main(String[] args) {
        // Creating an object with matching constructor parameters
        Studentclass s1 = new Studentclass("Vishal", 78, 98.8f); // Use 'f' for float literal
        s1.printDetails();


    }
}
