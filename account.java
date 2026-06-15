class Account {
    void calculateInterest() {
        System.out.println("Generic interest calculation");
    }
}
class SavingsAccount extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Savings Account interest calculated");
    }
}
class CurrentAccount extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Current Account interest calculated");
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        Account a2 = new CurrentAccount();
        a1.calculateInterest();
        a2.calculateInterest();
    }
}
