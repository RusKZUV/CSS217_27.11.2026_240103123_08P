package Task05;

public class FrenchPressStrategy implements BrewingStrategy {
    @Override
    public int getWaterTemperature() { return 95; } // 95°C

    @Override
    public int getExtractionTime() { return 240; } // 4 минуты

    @Override
    public String getBrewingMethod() { return "French Press"; }
}