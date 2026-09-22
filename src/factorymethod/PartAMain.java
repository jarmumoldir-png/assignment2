package factorymethod;

public class PartAMain {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        System.out.println("PART A - Factory Method");

        String region = "KZ";

        PaymentProcessorFactory factory;
        if (region.equals("KZ")) {
            factory = new KaspiProcessorFactory();
        } else if (region.equals("US")) {
            factory = new VisaProcessorFactory();
        } else {
            factory = new MastercardProcessorFactory();
        }

        factory.checkout(15000, "KZT");
        factory.checkout(49.99, "USD");
    }
}
