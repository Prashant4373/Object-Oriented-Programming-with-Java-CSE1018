abstract class Employee {
    abstract double calculateSalary();
}
class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 50000;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Manager();
        System.out.println("Salary: " + e.calculateSalary());
    }
}
