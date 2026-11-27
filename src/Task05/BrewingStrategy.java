package Task05;

public interface BrewingStrategy {
    int getWaterTemperature();
    int getExtractionTime(); // в секундах
    String getBrewingMethod();
}