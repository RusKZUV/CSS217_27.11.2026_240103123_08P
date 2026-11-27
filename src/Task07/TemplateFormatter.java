package Task07;

import java.util.Map;

public class TemplateFormatter {
    public String render(String templateKey, Map<String, String> payload) {
        // Имитация движка шаблонов
        String template = "Привет! Это уведомление по теме: " + templateKey + ". Детали: ";
        StringBuilder sb = new StringBuilder(template);
        payload.forEach((key, value) -> sb.append(key).append("=").append(value).append("; "));
        return sb.toString();
    }
}