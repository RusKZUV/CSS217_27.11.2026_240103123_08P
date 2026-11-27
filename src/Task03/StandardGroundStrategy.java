package Task03;

public class StandardGroundStrategy implements ShippingRateStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        return 5.0 + (weight * 0.5) + (distance * 0.1);
    }

    @Override
    public String getDeliveryTime() {
        return "3-5 business days";
    }

    @Override
    public String getStrategyName() {
        return "Standard Ground";
    }
}