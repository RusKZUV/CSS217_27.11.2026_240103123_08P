package Task07;

public class EmailDelivery implements DeliveryChannelStrategy {
    @Override
    public void deliver(String contactInfo, String formattedMessage) {
        System.out.println("[Email Service] Отправка на " + contactInfo + "...");
        System.out.println("Тема: Уведомление");
        System.out.println("Тело: " + formattedMessage);
    }

    @Override
    public String getChannelName() { return "EMAIL"; }
}