package Task05;

public class Main5 {
    public static void main(String[] args) {
        // Инициализируем фасад со стратегией Эспрессо
        BaristaFacade barista = new BaristaFacade(new EspressoPullStrategy());

        // 1. Готовим Эспрессо
        barista.prepareBeverage("Arabica Beans");

        // 2. Меняем стратегию на Пуровер
        barista.setStrategy(new PourOverStrategy());
        barista.prepareBeverage("Ethiopian Yirgacheffe");

        // 3. Меняем стратегию на Френч-пресс
        barista.setStrategy(new FrenchPressStrategy());
        barista.prepareBeverage("Colombian Supremo");
    }
}