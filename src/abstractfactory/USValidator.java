package abstractfactory;

public class USValidator implements Validator {
    @Override 
    public String region() { return "US"; }

    @Override
    public boolean check(Card c) {
        System.out.println("US check: signature + zip");
        return c.maskedNumber().endsWith("4242");
    }
}