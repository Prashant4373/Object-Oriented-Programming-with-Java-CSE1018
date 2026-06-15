class Staff {
    void performDuty() {
        System.out.println("Generic duty");
    }
}
class Doctor extends Staff {
    @Override
    void performDuty() {
        System.out.println("Doctor treats patients");
    }
}
class Nurse extends Staff {
    @Override
    void performDuty() {
        System.out.println("Nurse assists doctor");
    }
}
public class Hospital {
    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        s1.performDuty();
        s2.performDuty();
    }
}
