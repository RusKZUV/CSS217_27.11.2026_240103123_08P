package Task03;

public interface ShippingRateStrategy {
    double calculateCost(double weight, double distance);
    String getDeliveryTime();
    String getStrategyName();
}