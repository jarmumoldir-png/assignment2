package abstractfactory;

public class USCard implements Card {
    @Override 
    public String brand() { return "US Credit Card"; }
    @Override 
    public String maskedNumber() { return "**** **** **** 4242"; }
    @Override 
    public boolean needsPin() { return false; }
}