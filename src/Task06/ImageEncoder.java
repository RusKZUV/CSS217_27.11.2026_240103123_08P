package Task06;

import java.io.FileWriter;
import java.io.IOException;

public class ImageEncoder {
    public void encodeAndSave(int[][] pixelMatrix, String outputPath) {
        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write("--- IMAGE METADATA ---\n");
            writer.write("Pixels: " + pixelMatrix.length + "\n");
            writer.write("--- PIXEL DATA (RGB) ---\n");
            for (int[] pixel : pixelMatrix) {
                writer.write("[" + pixel[0] + ", " + pixel[1] + ", " + pixel[2] + "]\n");
            }
            System.out.println("[Encoder] Изображение успешно сохранено: " + outputPath);
        } catch (IOException e) {
            System.err.println("[Encoder] Ошибка сохранения: " + e.getMessage());
        }
    }
}