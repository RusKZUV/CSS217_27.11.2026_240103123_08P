package Task07;

public interface DeliveryChannelStrategy {
    void deliver(String contactInfo, String formattedMessage);
    String getChannelName();
}