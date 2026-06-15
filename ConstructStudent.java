public class ConstructStudent {
    int id;
    String name;

    ConstructStudent(int i, String n) {
        id = i;
        name = n;
    }       

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        ConstructStudent s1 = new ConstructStudent(101, "MS Dhoni");
        ConstructStudent s2 = new ConstructStudent(102, "Ashwin");
      
        s1.display();
        s2.display();
    }
}       
