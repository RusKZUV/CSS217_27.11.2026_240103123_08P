package Task03;

public class SameDayCourierStrategy implements ShippingRateStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        // Фиксированная цена для экспресс-доставки, но зависит от веса
        return 25.0 + (weight * 2.0);
    }

    @Override
    public String getDeliveryTime() {
        return "Same Day (by 8 PM)";
    }

    @Override
    public String getStrategyName() {
        return "Same Day Courier";
    }
}