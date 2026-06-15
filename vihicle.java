class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine starts");
    }
}
public class RentalService {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
