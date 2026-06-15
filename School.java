// Superclass
class Person {
    void displayRole() {
        System.out.println("Person has a role in school");
    }
}

// Subclass Teacher
class Teacher extends Person {
    @Override
    void displayRole() {
        System.out.println("Teacher teaches students");
    }
}

// Subclass Student
class Student extends Person {
    @Override
    void displayRole() {
        System.out.println("Student learns from teachers");
    }
}

// Main class
public class School {
    public static void main(String[] args) {
        // Superclass reference, subclass objects
        Person p1 = new Teacher();   // Upcasting
        Person p2 = new Student();   // Upcasting

        // Dynamic dispatch: JVM decides at runtime
        p1.displayRole();  // Calls Teacher's displayRole()
        p2.displayRole();  // Calls Student's displayRole()
    }
}
