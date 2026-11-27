package Task08;

public class Main8 {
    public static void main(String[] args) {
        // Инициализируем оформление заказа с оплатой картой
        CheckoutFacade checkout = new CheckoutFacade(new CreditCardPayment());

        // 1. Успешная оплата (сумма меньше 1000)
        checkout.checkout("ORDER-1001", 500.0);

        // 2. Неудачная оплата (сумма больше 1000 -> банк отклонил)
        // Фасад должен освободить товар на складе
        checkout.checkout("ORDER-1002", 1200.0);

        // 3. Меняем стратегию на лету на Цифровой кошелек (он одобряет всё)
        // Пытаемся оформить тот же крупный заказ заново
        System.out.println("\n[Клиент] Меняем способ оплаты на Digital Wallet и пробуем снова...");
        checkout.setPaymentStrategy(new DigitalWalletPayment());
        checkout.checkout("ORDER-1002-RETRY", 1200.0);
    }
}