package Task07;

public class PushNotificationDelivery implements DeliveryChannelStrategy {
    @Override
    public void deliver(String contactInfo, String formattedMessage) {
        System.out.println("[Push Service] Пуш-уведомление на устройство " + contactInfo + "...");
        System.out.println("Контент: " + formattedMessage);
    }

    @Override
    public String getChannelName() { return "PUSH"; }
}