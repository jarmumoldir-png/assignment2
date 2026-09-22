package factorymethod;

public class VisaProcessorFactory extends PaymentProcessorFactory {
    @Override
    protected PaymentProcessor createProcessor() {
        return new VisaProcessor();
    }
}
