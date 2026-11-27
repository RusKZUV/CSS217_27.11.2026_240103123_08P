package Task02;

import java.io.FileWriter;
import java.io.IOException;

public class DiskWriter {
    public void writeToDisk(String data, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(data);
            System.out.println("[DiskWriter] Файл успешно сохранен по пути: " + path);
        } catch (IOException e) {
            System.err.println("[DiskWriter] Ошибка записи файла: " + e.getMessage());
        }
    }
}