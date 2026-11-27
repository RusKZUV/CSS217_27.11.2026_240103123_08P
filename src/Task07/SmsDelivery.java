package Task07;

public class SmsDelivery implements DeliveryChannelStrategy {
    @Override
    public void deliver(String contactInfo, String formattedMessage) {
        System.out.println("[SMS Gateway] Отправка SMS на номер " + contactInfo + "...");
        System.out.println("Текст: " + formattedMessage);
    }

    @Override
    public String getChannelName() { return "SMS"; }
}