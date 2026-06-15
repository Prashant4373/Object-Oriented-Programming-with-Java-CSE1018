class Bank {
    // Principal only (default rate & time)
    public double calculateInterest(double principal) {
        double rate = 5; // default %
        int time = 1;    // default year
        return (principal * rate * time) / 100;
    }

    // Principal + rate
    public double calculateInterest(double principal, double rate) {
        int time = 1; // default year
        return (principal * rate * time) / 100;
    }

    // Principal + rate + time
    public double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Interest (default): " + b.calculateInterest(10000));
        System.out.println("Interest (principal + rate): " + b.calculateInterest(10000, 7));
        System.out.println("Interest (principal + rate + time): " + b.calculateInterest(10000, 7, 2));
    }
}
