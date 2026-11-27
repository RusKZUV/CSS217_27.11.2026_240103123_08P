package Task01;

public class PowerGridMonitor {
    private double currentLoad = 3.5; // Имитация нагрузки

    public boolean isStable() {
        return currentLoad < 8.0;
    }

    public void setCurrentLoad(double load) {
        this.currentLoad = load;
    }
}