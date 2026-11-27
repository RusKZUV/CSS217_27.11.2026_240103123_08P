package Task03;

public class RateCalculator {
    public double computeRate(ShippingRateStrategy strategy, double weight, double distance) {
        return strategy.calculateCost(weight, distance);
    }
}