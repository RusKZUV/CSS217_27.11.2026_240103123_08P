package Task05;

public class EspressoPullStrategy implements BrewingStrategy {
    @Override
    public int getWaterTemperature() { return 93; } // 93°C

    @Override
    public int getExtractionTime() { return 25; } // 25 секунд

    @Override
    public String getBrewingMethod() { return "Espresso Pull"; }
}