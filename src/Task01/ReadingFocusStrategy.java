package Task01;

public class ReadingFocusStrategy implements LightingStrategy {
    @Override
    public int getBrightness() { return 80; }
    @Override
    public int getColorTemperature() { return 5000; }
    @Override
    public String getSceneName() { return "ReadingFocus"; }
}