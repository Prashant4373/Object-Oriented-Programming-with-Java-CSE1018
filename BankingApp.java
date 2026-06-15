class Account {
    void showBenefits() {
        System.out.println("Generic benefits");
    }
}

class Savings extends Account {
    @Override
    void showBenefits() {
        System.out.println("Savings Account: easy withdrawal");
    }
}

class FixedDeposit extends Account {
    @Override
    void showBenefits() {
        System.out.println("Fixed Deposit: higher interest");
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account a1 = new Savings();
        Account a2 = new FixedDeposit();

        a1.showBenefits();
        a2.showBenefits();
    }
}