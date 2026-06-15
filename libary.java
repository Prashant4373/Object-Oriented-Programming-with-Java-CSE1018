class Library {
    // Days late
    public double calculateFine(int days) {
        return days * 2; // Rs.2 per day
    }

    // Days late + book type
    public double calculateFine(int days, String bookType) {
        double rate = bookType.equals("Reference") ? 5 : 2;
        return days * rate;
    }

    // Days late + book type + membership
    public double calculateFine(int days, String bookType, boolean isPremiumMember) {
        double rate = bookType.equals("Reference") ? 5 : 2;
        double fine = days * rate;
        if (isPremiumMember) fine *= 0.5; // 50% discount
        return fine;
    }

    public static void main(String[] args) {
        Library l = new Library();
        System.out.println("Fine (days): " + l.calculateFine(5));
        System.out.println("Fine (days + type): " + l.calculateFine(5, "Reference"));
        System.out.println("Fine (days + type + member): " + l.calculateFine(5, "Reference", true));
    }
}
