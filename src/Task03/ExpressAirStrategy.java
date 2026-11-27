package Task03;

public class ExpressAirStrategy implements ShippingRateStrategy {
    @Override
    public double calculateCost(double weight, double distance) {
        return 15.0 + (weight * 1.2) + (distance * 0.4);
    }

    @Override
    public String getDeliveryTime() {
        return "1-2 business days";
    }

    @Override
    public String getStrategyName() {
        return "Express Air";
    }
}