package Task02;

import java.time.LocalDateTime;

public class MetadataStamp {
    public String addStamp(String content) {
        String stamp = "\n\n--- Exported on: " + LocalDateTime.now() + " ---";
        return content + stamp;
    }
}