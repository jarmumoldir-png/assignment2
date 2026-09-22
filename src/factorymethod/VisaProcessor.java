package factorymethod;

public class VisaProcessor implements PaymentProcessor {

    @Override
    public String getName() { return "Visa"; }

    @Override
    public String pay(double amount, String currency) {
        System.out.println("Visa: charging " + amount + " " + currency);
        System.out.println("Visa: 3D secure check passed");
        return "VISA-" + System.currentTimeMillis();
    }

    @Override
    public int authTime() { return 3; }
}