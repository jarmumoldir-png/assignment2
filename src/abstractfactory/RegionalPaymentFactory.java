package abstractfactory;

public interface RegionalPaymentFactory {
    Card createCard();
    Receipt createReceipt();
    Validator createValidator();
}