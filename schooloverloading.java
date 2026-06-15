class SchoolMarks {

    // Case 1: Marks of 3 subjects
    public int calculateTotalMarks(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        System.out.println("Average (3 subjects): " + (total / 3.0));
        return total;
    }

    // Case 2: Marks of 5 subjects
    public int calculateTotalMarks(int m1, int m2, int m3, int m4, int m5) {
        int total = m1 + m2 + m3 + m4 + m5;
        System.out.println("Average (5 subjects): " + (total / 5.0));
        return total;
    }

    // Case 3: Marks with optional bonus
    public int calculateTotalMarks(int[] marks, int bonus) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        total += bonus;
        System.out.println("Average (with bonus): " + (total / (marks.length * 1.0)));
        return total;
    }

    public static void main(String[] args) {
        SchoolMarks obj = new SchoolMarks();

        System.out.println("Total (3 subjects): " + obj.calculateTotalMarks(80, 75, 90));
        System.out.println("Total (5 subjects): " + obj.calculateTotalMarks(80, 75, 90, 85, 70));
        System.out.println("Total (with bonus): " + obj.calculateTotalMarks(new int[]{80, 75, 90}, 10));
    }
}
