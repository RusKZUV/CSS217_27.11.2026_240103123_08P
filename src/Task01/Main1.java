package Task01;

public class Main1 {
    public static void main(String[] args) {
        // Инициализируем фасад со стартовой стратегией
        HomeLightingFacade facade = new HomeLightingFacade(new EcoDimStrategy());

        // 1. Тестируем EcoDim
        facade.applyScene();

        // 2. Меняем стратегию на лету (Runtime switching)
        facade.setStrategy(new ReadingFocusStrategy());
        facade.applyScene();

        // 3. Тестируем AmbientParty
        facade.setStrategy(new AmbientPartyStrategy());
        facade.applyScene();
    }
}