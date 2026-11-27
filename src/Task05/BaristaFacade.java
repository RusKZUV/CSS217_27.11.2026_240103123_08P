package Task05;

public class BaristaFacade {
    private BrewingStrategy strategy;
    private BeanGrinder grinder;
    private WaterBoiler boiler;
    private BrewChamber chamber;

    public BaristaFacade(BrewingStrategy strategy) {
        this.strategy = strategy;
        this.grinder = new BeanGrinder();
        this.boiler = new WaterBoiler();
        this.chamber = new BrewChamber();
    }

    public void setStrategy(BrewingStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод: клиент просто указывает сорт зерен, остальное делает фасад
    public void prepareBeverage(String beanType) {
        System.out.println("\n=== Старт приготовления: " + strategy.getBrewingMethod() + " ===");

        // 1. Готовим зерна
        grinder.grindBeans(beanType);

        // 2. Нагреваем воду согласно стратегии
        boiler.heatWater(strategy.getWaterTemperature());

        // 3. Варим согласно стратегии
        chamber.brew(strategy.getExtractionTime(), strategy.getBrewingMethod());

        System.out.println("=== Наслаждайтесь вашим " + strategy.getBrewingMethod() + " ===\n");
    }
}