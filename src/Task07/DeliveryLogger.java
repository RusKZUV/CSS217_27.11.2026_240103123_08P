package Task07;

import java.time.LocalDateTime;

public class DeliveryLogger {
    public void logStatus(String userId, String channel, boolean success) {
        String status = success ? "SUCCESS" : "FAILED";
        System.out.println("[Logger] " + LocalDateTime.now() + " | User: " + userId +
                " | Channel: " + channel + " | Status: " + status);
    }
}