class BonusCalculator {
    // Fixed bonus
    public double calculateBonus(double fixedBonus) {
        return fixedBonus;
    }

    // Bonus based on salary percentage
    public double calculateBonus(double salary, double percentage) {
        return salary * percentage / 100;
    }

    // Bonus based on salary + performance rating
    public double calculateBonus(double salary, double percentage, int rating) {
        double baseBonus = salary * percentage / 100;
        return baseBonus + (rating * 1000); // rating adds extra
    }

    public static void main(String[] args) {
        BonusCalculator b = new BonusCalculator();
        System.out.println("Fixed bonus: " + b.calculateBonus(5000));
        System.out.println("Bonus (salary %): " + b.calculateBonus(20000, 10));
        System.out.println("Bonus (salary + rating): " + b.calculateBonus(20000, 10, 4));
    }
}
