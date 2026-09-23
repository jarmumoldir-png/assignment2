package abstractfactory;

public class AsiaReceipt implements Receipt {
    @Override 
    public String formatName() { return "Asia Receipt"; }

    @Override
    public String render(String merchant, double amount, String currency) {
        return "ASIA RECEIPT\n" +
               "merchant: " + merchant + "\n" +
               "tax included: 9%\n" +
               "total: " + amount + " " + currency;
    }
}