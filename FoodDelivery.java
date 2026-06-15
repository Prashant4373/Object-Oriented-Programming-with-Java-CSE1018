class Food {
    void prepareFood() {
        System.out.println("Preparing generic food");
    }
}
class Pizza extends Food {
    @Override
    void prepareFood() {
        System.out.println("Preparing Pizza");
    }
}
class Burger extends Food {
    @Override
    void prepareFood() {
        System.out.println("Preparing Burger");
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        Food f1 = new Pizza();
        Food f2 = new Burger();
        f1.prepareFood();
        f2.prepareFood();
    }
}
