package abstractfactory;

public class EUValidator implements Validator {
    @Override 
    public String region() { return "EU"; }

    @Override
    public boolean check(Card c) {
        System.out.println("EU check: PIN required");
        return c.needsPin();
    }
}