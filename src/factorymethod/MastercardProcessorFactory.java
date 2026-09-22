package factorymethod;

public class MastercardProcessorFactory extends PaymentProcessorFactory {
    @Override
    protected PaymentProcessor createProcessor() {
        return new MastercardProcessor();
    }
}
