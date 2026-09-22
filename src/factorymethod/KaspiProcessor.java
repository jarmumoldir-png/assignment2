package factorymethod;

public class KaspiProcessor implements PaymentProcessor {

    @Override
    public String getName() { return "Kaspi.kz"; }

    @Override
    public String pay(double amount, String currency) {
        System.out.println("Kaspi: charging " + amount + " " + currency);
        System.out.println("Kaspi: approved intantly");
        return "KASPI-" + System.currentTimeMillis();
    }

    @Override
    public int authTime() { return 1; }
}