package factorymethod;

public class KaspiProcessorFactory extends PaymentProcessorFactory {
    @Override
    protected PaymentProcessor createProcessor() {
        return new KaspiProcessor();
    }
}
