class Company {
    // Basic salary
    public double calculateSalary(double basic) {
        return basic;
    }

    // Basic + HRA
    public double calculateSalary(double basic, double hra) {
        return basic + hra;
    }

    // Basic + HRA + Bonus
    public double calculateSalary(double basic, double hra, double bonus) {
        return basic + hra + bonus;
    }

    public static void main(String[] args) {
        Company c = new Company();
        System.out.println("Salary (basic): " + c.calculateSalary(20000));
        System.out.println("Salary (basic + HRA): " + c.calculateSalary(20000, 5000));
        System.out.println("Salary (basic + HRA + Bonus): " + c.calculateSalary(20000, 5000, 3000));
    }
}
