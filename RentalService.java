// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts with a key");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

// Main class
public class RentalService {
    public static void main(String[] args) {
        // Superclass reference, subclass objects
        Vehicle v1 = new Car();   // Upcasting
        Vehicle v2 = new Bike();  // Upcasting

        // Dynamic dispatch: JVM decides at runtime
        v1.start();  // Calls Car's start()
        v2.start();  // Calls Bike's start()
    }
}
