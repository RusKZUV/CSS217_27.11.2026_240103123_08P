package Task01;

public class AmbientPartyStrategy implements LightingStrategy {
    @Override
    public int getBrightness() { return 55; }
    @Override
    public int getColorTemperature() { return 4000; }
    @Override
    public String getSceneName() { return "AmbientParty"; }
}