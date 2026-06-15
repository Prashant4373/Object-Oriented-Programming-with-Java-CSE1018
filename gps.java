class GPS {
    // Distance between two integer points
    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Distance between two double points
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Distance in 3D coordinates
    public double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    public static void main(String[] args) {
        GPS g = new GPS();
        System.out.println("2D int distance: " + g.calculateDistance(0, 0, 3, 4));
        System.out.println("2D double distance: " + g.calculateDistance(0.0, 0.0, 3.0, 4.0));
        System.out.println("3D distance: " + g.calculateDistance(0, 0, 0, 3, 4, 5));
    }
}
