package Task03;

public class ShippingFacade {
    private ShippingRateStrategy strategy;
    private BoxSelector boxSelector;
    private RateCalculator rateCalculator;
    private LabelPrinter labelPrinter;

    public ShippingFacade(ShippingRateStrategy strategy) {
        this.strategy = strategy;
        this.boxSelector = new BoxSelector();
        this.rateCalculator = new RateCalculator();
        this.labelPrinter = new LabelPrinter();
    }

    public void setStrategy(ShippingRateStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод для клиента: выбирает коробку, считает цену, печатает этикетку
    public void dispatchOrder(Order order) {
        System.out.println("\n[Facade] Обработка заказа: " + order.orderId);

        // 1. Подбор упаковки
        String box = boxSelector.selectBox(order.weight);

        // 2. Расчет стоимости с помощью выбранной стратегии
        double cost = rateCalculator.computeRate(strategy, order.weight, order.distance);

        // 3. Печать этикетки
        labelPrinter.printLabel(
                order.orderId,
                box,
                cost,
                strategy.getStrategyName(),
                strategy.getDeliveryTime()
        );
    }
}