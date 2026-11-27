package Task08;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean authorize(double amount) {
        System.out.println("[CreditCard] Запрос авторизации на $" + amount + "...");
        // Имитация: если сумма больше 1000, банк отклоняет
        if (amount > 1000) {
            System.out.println("[CreditCard] ОТКЛОНЕНО: Превышен лимит.");
            return false;
        }
        System.out.println("[CreditCard] УСПЕХ: Транзакция одобрена.");
        return true;
    }

    @Override
    public String getPaymentMethodName() { return "Credit Card"; }
}