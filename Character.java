class Character {
    void attack() {
        System.out.println("Character attacks");
    }
}
class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior attacks with sword");
    }
}
class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage attacks with magic");
    }
}
public class Game {
    public static void main(String[] args) {
        Character c1 = new Warrior();
        Character c2 = new Mage();
        c1.attack();
        c2.attack();
    }
}
