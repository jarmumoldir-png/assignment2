package abstractfactory;

public class EUReceipt implements Receipt {
    @Override 
    public String formatName() { return "EU Receipt"; }

    @Override
    public String render(String merchant, double amount, String currency) {
        return "EU RECEIPT\n" +
               "merchant: " + merchant + "\n" +
               "VAT included: 20%\n" +
               "total: " + amount + " " + currency;
    }
}