package Task01;

public class DimmerHardware {
    public void setBrightness(int level) {
        System.out.println("[Hardware] Яркость установлена на: " + level + "%");
    }

    public void setColorTemperature(int kelvin) {
        System.out.println("[Hardware] Цветовая температура: " + kelvin + "K");
    }

    public void turnOff() {
        System.out.println("[Hardware] Свет выключен.");
    }
}