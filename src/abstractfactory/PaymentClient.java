package abstractfactory;

public class PaymentClient {

    private RegionalPaymentFactory factory;

    public PaymentClient(RegionalPaymentFactory f) {
        this.factory = f;
    }

    public void pay(String merchant, double amount, String currency) {
        Card c = factory.createCard();
        Validator v = factory.createValidator();
        Receipt r = factory.createReceipt();

        System.out.println("region " + v.region() + ", card " + c.brand());

        if (!v.check(c)) {
            System.out.println("validation failed");
            return;
        }

        System.out.println(r.render(merchant, amount, currency));
        System.out.println();
    }
}