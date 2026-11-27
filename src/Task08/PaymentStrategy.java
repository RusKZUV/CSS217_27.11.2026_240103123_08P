package Task08;

public interface PaymentStrategy {
    boolean authorize(double amount);
    String getPaymentMethodName();
}