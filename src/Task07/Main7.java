package Task07;

import java.util.HashMap;
import java.util.Map;

public class Main7 {
    public static void main(String[] args) {
        // Подготовка данных
        Map<String, String> payload = new HashMap<>();
        payload.put("order_id", "ORD-999");
        payload.put("status", "Shipped");

        // Инициализация фасада со стратегией Email
        NotificationFacade facade = new NotificationFacade(new EmailDelivery());
        facade.sendAlert("user_1", "OrderUpdate", payload);

        // Меняем на SMS
        facade.setStrategy(new SmsDelivery());
        facade.sendAlert("user_2", "DeliveryAlert", payload);

        // Меняем на Push
        facade.setStrategy(new PushNotificationDelivery());
        facade.sendAlert("user_3", "PromoCode", payload);

        // Тест обработки ошибки (пользователь не найден)
        facade.sendAlert("user_999", "ErrorTest", payload);
    }
}