class Payment {
    void processPayment() {
        System.out.println("Generic payment process");
    }
}
class CashOnDelivery extends Payment {
    @Override
    void processPayment() {
        System.out.println("Cash on Delivery selected");
    }
}
class OnlinePayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Online Payment selected");
    }
}
public class Shopping {
    public static void main(String[] args) {
        Payment p1 = new CashOnDelivery();
        Payment p2 = new OnlinePayment();
        p1.processPayment();
        p2.processPayment();
    }
}
