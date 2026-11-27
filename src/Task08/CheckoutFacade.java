package Task08;

public class CheckoutFacade {
    private PaymentStrategy strategy;
    private InventoryLockService inventory;
    private TaxEngine taxEngine;
    private PaymentProcessor processor;
    private ReceiptGenerator receiptGen;

    public CheckoutFacade(PaymentStrategy strategy) {
        this.strategy = strategy;
        this.inventory = new InventoryLockService();
        this.taxEngine = new TaxEngine();
        this.processor = new PaymentProcessor();
        this.receiptGen = new ReceiptGenerator();
    }

    // Runtime switching
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Главный метод оформления заказа с логикой отката
    public void checkout(String orderId, double subtotal) {
        System.out.println("\n--- Начало оформления заказа: " + orderId + " ---");

        // 1. Блокируем товар на складе
        inventory.lockItems(orderId);

        // 2. Считаем итоговую сумму с налогом
        double tax = taxEngine.calculateTax(subtotal);
        double total = subtotal + tax;
        System.out.println("[Checkout] Итоговая сумма к оплате: $" + String.format("%.2f", total));

        // 3. Пытаемся оплатить
        boolean isSuccess = processor.process(strategy, total);

        if (isSuccess) {
            // 4а. Если успех — генерируем чек
            receiptGen.generate(orderId, strategy.getPaymentMethodName(), total);
        } else {
            // 4б. Если ошибка — ОТКАТ (rollback): освобождаем товар
            System.out.println("!!! ОШИБКА ОПЛАТЫ. Инициирован откат (Rollback) !!!");
            inventory.releaseItems(orderId);
            System.out.println("Заказ " + orderId + " отменен. Попробуйте другой способ оплаты.\n");
        }
    }
}