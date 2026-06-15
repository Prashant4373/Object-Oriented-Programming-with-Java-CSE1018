abstract class BankAccount {
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    double balance = 10000;
    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " Balance: " + balance);
    }
}
public class TestBank {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount();
        acc.withdraw(2000);
    }
}
