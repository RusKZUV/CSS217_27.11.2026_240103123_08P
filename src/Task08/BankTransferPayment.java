package Task08;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public boolean authorize(double amount) {
        System.out.println("[BankTransfer] Инициирован банковский перевод на $" + amount + "...");
        // Имитация: переводы всегда проходят, но с задержкой
        System.out.println("[BankTransfer] УСПЕХ: Перевод подтвержден.");
        return true;
    }

    @Override
    public String getPaymentMethodName() { return "Bank Transfer"; }
}