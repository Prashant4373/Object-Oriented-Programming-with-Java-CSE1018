//method overloading in polymorphism
class overloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        overloading obj = new overloading();

        System.out.println("Sum of 2 integers: " + obj.add(5, 10));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of double values: " + obj.add(5.5, 2.5));
        
    }
}       