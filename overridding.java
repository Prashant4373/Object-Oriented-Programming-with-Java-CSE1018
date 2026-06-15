//method overriding in polymorphism(run time polymorphism)
class Parent {
    void display(){
        System.out.println("This is the parent class.");
    }

}
class Child extends Parent {
    void display(){
        System.out.println("This is the child class.");
    }
}
public class overridding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.display(); 
        c.display(); 

        Parent pc = new Child();
        pc.display(); 
    }
}