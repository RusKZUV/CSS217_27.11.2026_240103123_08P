package Task06;

public class ImageDecoder {
    // Имитация декодирования картинки
    public int[][] decode(String inputPath) {
        System.out.println("[Decoder] Декодирование изображения: " + inputPath);
        // Возвращаем тестовую матрицу (3 пикселя)
        return new int[][] {
                {255, 100, 50},
                {20, 200, 100},
                {10, 50, 250}
        };
    }
}