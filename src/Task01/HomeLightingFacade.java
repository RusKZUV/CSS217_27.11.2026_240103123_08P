package Task01;

public class HomeLightingFacade {
    private LightingStrategy strategy;
    private PowerGridMonitor grid;
    private DimmerHardware dimmer;
    private RoomSensor sensor;

    public HomeLightingFacade(LightingStrategy strategy) {
        this.strategy = strategy;
        this.grid = new PowerGridMonitor();
        this.dimmer = new DimmerHardware();
        this.sensor = new RoomSensor();
    }

    // Клиент может менять стратегию на лету
    public void setStrategy(LightingStrategy strategy) {
        this.strategy = strategy;
    }

    // Единая точка входа для клиента (как требуется в задании)
    public void applyScene() {
        System.out.println("\n--- Применение сцены: " + strategy.getSceneName() + " ---");

        if (!sensor.isOccupied()) {
            System.out.println("[Facade] В комнате никого нет. Свет выключается.");
            dimmer.turnOff();
            return;
        }

        if (!grid.isStable()) {
            System.out.println("[Facade] Скачок напряжения! Принудительное аварийное освещение.");
            dimmer.setBrightness(10);
            dimmer.setColorTemperature(2700);
            return;
        }

        // Компенсация внешнего света
        int adjustedBrightness = Math.max(5, strategy.getBrightness() - (sensor.getAmbientLight() / 20));

        dimmer.setBrightness(adjustedBrightness);
        dimmer.setColorTemperature(strategy.getColorTemperature());
    }
}