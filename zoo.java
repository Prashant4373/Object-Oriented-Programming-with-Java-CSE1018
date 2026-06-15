// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class zoo {
    public static void main(String[] args) {
        // Superclass reference, subclass objects
        Animal a1 = new Dog();   // Upcasting
        Animal a2 = new Cat();   // Upcasting

        // Dynamic dispatch: JVM decides at runtime
        a1.sound();  // Calls Dog's sound()
        a2.sound();  // Calls Cat's sound()
    }
}
