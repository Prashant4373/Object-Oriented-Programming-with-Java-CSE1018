class Student {
    void study() {   // ✅ define method in superclass
        System.out.println("Generic study");
    }
}

class Undergraduate extends Student {
    @Override
    void study() {
        System.out.println("Undergraduate studies basics");
    }
}

class Postgraduate extends Student {
    @Override
    void study() {
        System.out.println("Postgraduate studies advanced topics");
    }
}

public class University {
    public static void main(String[] args) {
        Student s1 = new Undergraduate();
        Student s2 = new Postgraduate();
        s1.study();
        s2.study();
    }
}
