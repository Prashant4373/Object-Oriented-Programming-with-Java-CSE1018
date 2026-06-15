abstract class Shape {
    abstract double area();   // ✅ abstract method must be implemented
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());
    }
}
