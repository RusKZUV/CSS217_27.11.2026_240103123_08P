package Task01;

public class EcoDimStrategy implements LightingStrategy {
    @Override
    public int getBrightness() { return 25; }
    @Override
    public int getColorTemperature() { return 2700; }
    @Override
    public String getSceneName() { return "EcoDim"; }
}