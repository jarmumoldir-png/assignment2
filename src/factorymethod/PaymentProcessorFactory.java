package factorymethod;

public abstract class PaymentProcessorFactory {

    protected abstract PaymentProcessor createProcessor();

    public void checkout(double amount, String currency) {
        PaymentProcessor p = createProcessor();
        System.out.println("using " + p.getName() + " (auth ~" + p.authTime() + "s)");
        String id = p.pay(amount, currency);
        System.out.println("transactionID: " + id);
        System.out.println();
    }
}