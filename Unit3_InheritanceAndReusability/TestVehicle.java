// Abstract class
abstract class Vehicle {
    // Concrete method (implemented)
    void start() {
        System.out.println("Vehicle is starting...");
    }

    // Abstract method (must be implemented by child class)
    abstract void fuelType();
}

// Concrete class (extends abstract class)
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    void fuelType() {
        System.out.println("Car runs on petrol or diesel.");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();      // Calls the concrete method
        myCar.fuelType();   // Calls the overridden method
    }
}
