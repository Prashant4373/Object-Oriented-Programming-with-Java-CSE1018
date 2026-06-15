class Product {
    void showDetails() {
        System.out.println("Generic product");
    }
}

class Book extends Product {
    @Override
    void showDetails() {
        System.out.println("Book details shown");
    }
}

class Electronics extends Product {
    @Override
    void showDetails() {
        System.out.println("Electronics details shown");
    }
}

public class Store {
    public static void main(String[] args) {
        Product p1 = new Book();
        Product p2 = new Electronics();
        p1.showDetails();
        p2.showDetails();
    }
}
