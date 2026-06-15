class Insurance {
    void calculatePremium() {
        System.out.println("Generic premium");
    }
}
class HealthInsurance extends Insurance {
    @Override
    void calculatePremium() {
        System.out.println("Health Insurance premium calculated");
    }
}
class VehicleInsurance extends Insurance {
    @Override
    void calculatePremium() {
        System.out.println("Vehicle Insurance premium calculated");
    }
}
public class InsuranceCompany {
    public static void main(String[] args) {
        Insurance i1 = new HealthInsurance();
        Insurance i2 = new VehicleInsurance();
        i1.calculatePremium();
        i2.calculatePremium();
    }
}
