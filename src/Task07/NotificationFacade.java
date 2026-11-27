package Task07;

import java.util.Map;

public class NotificationFacade {
    private DeliveryChannelStrategy strategy;
    private UserPreferenceStore prefStore;
    private TemplateFormatter formatter;
    private DeliveryLogger logger;

    public NotificationFacade(DeliveryChannelStrategy strategy) {
        this.strategy = strategy;
        this.prefStore = new UserPreferenceStore();
        this.formatter = new TemplateFormatter();
        this.logger = new DeliveryLogger();
    }

    public void setStrategy(DeliveryChannelStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод для клиента
    public void sendAlert(String userId, String messageKey, Map<String, String> payload) {
        System.out.println("\n=== Отправка уведомления через " + strategy.getChannelName() + " ===");

        boolean success = false;
        try {
            // 1. Получаем контактные данные
            String contact = prefStore.getContactInfo(userId);
            if (contact.equals("unknown_contact")) {
                throw new Exception("Контакт не найден для пользователя " + userId);
            }

            // 2. Формируем сообщение
            String message = formatter.render(messageKey, payload);

            // 3. Отправляем через выбранную стратегию
            strategy.deliver(contact, message);
            success = true;
        } catch (Exception e) {
            System.out.println("[Error] Ошибка отправки: " + e.getMessage());
        } finally {
            // 4. Логируем результат (всегда)
            logger.logStatus(userId, strategy.getChannelName(), success);
        }
    }
}