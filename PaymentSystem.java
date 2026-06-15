// Superclass
class Payment {
    void pay() {
        System.out.println("Payment is being processed");
    }
}

// Subclass CreditCard
class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

// Subclass UPI
class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        // Superclass reference, subclass objects
        Payment p1 = new CreditCard();  // Upcasting
        Payment p2 = new UPI();         // Upcasting

        // Dynamic dispatch: JVM decides at runtime
        p1.pay();  // Calls CreditCard's pay()
        p2.pay();  // Calls UPI's pay()
    }
}
