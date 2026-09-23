package abstractfactory;

public class AsiaCard implements Card {
    @Override 
    public String brand() { return "Asia QR Pay"; }
    @Override 
    public String maskedNumber() { return "QR-****-5678"; }
    @Override 
    public boolean needsPin() { return false; } 
}