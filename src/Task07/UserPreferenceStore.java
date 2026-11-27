package Task07;

import java.util.HashMap;
import java.util.Map;

public class UserPreferenceStore {
    private Map<String, String> contactMap = new HashMap<>();

    public UserPreferenceStore() {
        // Имитация базы данных пользователей
        contactMap.put("user_1", "john.doe@example.com");
        contactMap.put("user_2", "+1-555-0198");
        contactMap.put("user_3", "device_token_xyz123");
    }

    public String getContactInfo(String userId) {
        return contactMap.getOrDefault(userId, "unknown_contact");
    }
}