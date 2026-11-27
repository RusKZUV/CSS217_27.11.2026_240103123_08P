package Task03;

public class Main {
    public static void main(String[] args) {
        // Создаем заказ (ID: ORD-101, вес: 5кг, расстояние: 120км)
        Order order1 = new Order("ORD-101", 5.0, 120.0);

        // Инициализируем фасад со стандартной доставкой
        ShippingFacade shippingFacade = new ShippingFacade(new StandardGroundStrategy());
        shippingFacade.dispatchOrder(order1);

        // Меняем стратегию на лету на Авиа-экспресс
        shippingFacade.setStrategy(new ExpressAirStrategy());
        shippingFacade.dispatchOrder(order1);

        // Меняем на курьера на тот же день
        shippingFacade.setStrategy(new SameDayCourierStrategy());
        shippingFacade.dispatchOrder(order1);
    }
}