package Task05;

public class PourOverStrategy implements BrewingStrategy {
    @Override
    public int getWaterTemperature() { return 96; } // 96°C

    @Override
    public int getExtractionTime() { return 180; } // 3 минуты

    @Override
    public String getBrewingMethod() { return "Pour Over"; }
}