class GeometryApp {

    // Case 1: Circle (radius)
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Case 2: Rectangle (length, breadth)
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Case 3: Triangle (base, height)
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        GeometryApp obj = new GeometryApp();

        System.out.println("Area of Circle: " + obj.area(7));
        System.out.println("Area of Rectangle: " + obj.area(10, 5));
        System.out.println("Area of Triangle: " + obj.area(8, 6));
        
    }  
}
