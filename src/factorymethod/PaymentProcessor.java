package factorymethod;

public interface PaymentProcessor {
    String getName();
    String pay(double amount, String currency);
    int authTime();
}