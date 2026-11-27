package Task04;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivePackager {
    public void packageArchive(String compressedData, String checksum, String destination) {
        try (FileWriter writer = new FileWriter(destination)) {
            writer.write("--- ARCHIVE METADATA ---\n");
            writer.write("Checksum: " + checksum + "\n");
            writer.write("--- PAYLOAD ---\n");
            writer.write(compressedData);
            System.out.println("[Packager] Архив успешно упакован и сохранен: " + destination);
        } catch (IOException e) {
            System.err.println("[Packager] Ошибка упаковки: " + e.getMessage());
        }
    }
}