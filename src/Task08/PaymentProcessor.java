package Task08;

public class PaymentProcessor {
    public boolean process(PaymentStrategy strategy, double totalAmount) {
        return strategy.authorize(totalAmount);
    }
}