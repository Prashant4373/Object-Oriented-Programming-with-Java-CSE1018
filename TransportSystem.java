class Transport {
    void fare() {
        System.out.println("Generic fare");
    }
}
class Bus extends Transport {
    @Override
    void fare() {
        System.out.println("Bus fare calculated");
    }
}
class Train extends Transport {
    @Override
    void fare() {
        System.out.println("Train fare calculated");
    }
}
public class TransportSystem {
    public static void main(String[] args) {
        Transport t1 = new Bus();
        Transport t2 = new Train();
        t1.fare();
        t2.fare();
    }
}
