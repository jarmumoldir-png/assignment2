package abstractfactory;

public class AsiaValidator implements Validator {
    @Override 
    public String region() { return "ASIA"; }

    @Override
    public boolean check(Card c) {
        System.out.println("Asia check: QR code scan");
        return c.maskedNumber().startsWith("QR");
    }
}