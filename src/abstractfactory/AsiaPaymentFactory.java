package abstractfactory;

public class AsiaPaymentFactory implements RegionalPaymentFactory {
    @Override
    public Card createCard() { return new AsiaCard(); }
    @Override
    public Receipt createReceipt() { return new AsiaReceipt(); }
    @Override
    public Validator createValidator() { return new AsiaValidator(); }
}