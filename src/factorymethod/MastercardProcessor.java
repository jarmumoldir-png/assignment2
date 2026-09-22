package factorymethod;

public class MastercardProcessor implements PaymentProcessor {

    @Override
    public String getName() { return "Mastercard"; }

    @Override
    public String pay(double amount, String currency) {
        System.out.println("Mastercard: charging " + amount + " " + currency);
        System.out.println("Mastercard: 3D secure check passed");
        return "MC-" + System.currentTimeMillis();
    }

    @Override
    public int authTime() { return 2; }
}
