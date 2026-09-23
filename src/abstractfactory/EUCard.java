package abstractfactory;

public class EUCard implements Card {
    @Override 
    public String brand() { return "EU Debit Card"; }
    @Override 
    public String maskedNumber() { return "**** **** **** 1234"; }
    @Override 
    public boolean needsPin() { return true; } 
}