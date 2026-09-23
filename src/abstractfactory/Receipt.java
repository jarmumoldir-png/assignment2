package abstractfactory;

public interface Receipt {
    String formatName();
    String render(String merchant, double amount, String currency);
}