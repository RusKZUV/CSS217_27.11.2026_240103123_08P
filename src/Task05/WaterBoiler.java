package Task05;

public class WaterBoiler {
    public void heatWater(int targetTemperature) {
        System.out.println("[WaterBoiler] Нагрев воды до " + targetTemperature + "°C...");
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
    }
}