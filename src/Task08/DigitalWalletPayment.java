package Task08;

public class DigitalWalletPayment implements PaymentStrategy {
    @Override
    public boolean authorize(double amount) {
        System.out.println("[DigitalWallet] Запрос списания $" + amount + "...");
        // Имитация: кошелек всегда одобряет
        System.out.println("[DigitalWallet] УСПЕХ: Средства списаны.");
        return true;
    }

    @Override
    public String getPaymentMethodName() { return "Digital Wallet"; }
}