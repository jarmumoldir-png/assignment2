package abstractfactory;

public class PartBMain {
    public static void main(String[] args) {
        System.out.println("PART B - abstract factory");

        String region = "EU";
        RegionalPaymentFactory factory;

        if (region.equals("US")) {
            factory = new USPaymentFactory();
        } else if (region.equals("ASIA")) {
            factory = new AsiaPaymentFactory();
        } else {
            factory = new EUPaymentFactory();
        }

        PaymentClient client = new PaymentClient(factory);
        client.pay("Almaty Coffee", 4500, "EUR");

        client = new PaymentClient(new AsiaPaymentFactory());
        client.pay("Almaty Coffee", 4500, "KZT");
    }
}