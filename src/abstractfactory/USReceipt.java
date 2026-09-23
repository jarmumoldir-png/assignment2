package abstractfactory;

public class USReceipt implements Receipt {
    @Override 
    public String formatName() { return "US Receipt"; }

    @Override
    public String render(String merchant, double amount, String currency) {
        return "US RECEIPT\n" +
               "merchant: " + merchant + "\n" +
               "sales tax: 8%\n" +
               "total: " + amount + " " + currency;
    }
}