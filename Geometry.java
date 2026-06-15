class Geometry {
    // Circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Triangle
    public double area(double base, int height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println("Circle area: " + g.area(5));
        System.out.println("Rectangle area: " + g.area(4, 6));
        System.out.println("Triangle area: " + g.area(5, 8));
    }
}
