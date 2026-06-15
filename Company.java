// Superclass
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

// Subclass Manager
class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}

// Subclass Developer
class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

// Main class
public class Company {
    public static void main(String[] args) {
        // Superclass reference, subclass objects
        Employee emp1 = new Manager();   // Upcasting
        Employee emp2 = new Developer(); // Upcasting

        // Dynamic dispatch: JVM decides at runtime
        emp1.work();  // Calls Manager's work()
        emp2.work();  // Calls Developer's work()
    }
}
