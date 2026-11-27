package Task06;

public class ImagePipelineFacade {
    private FilterStrategy strategy;
    private ImageDecoder decoder;
    private ThumbnailResizer resizer;
    private ImageEncoder encoder;

    public ImagePipelineFacade(FilterStrategy strategy) {
        this.strategy = strategy;
        this.decoder = new ImageDecoder();
        this.resizer = new ThumbnailResizer();
        this.encoder = new ImageEncoder();
    }

    public void setStrategy(FilterStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод для клиента
    public void processImage(String inputPath, int width, int height, String outputPath) {
        System.out.println("\n=== Запуск обработки изображения (" + strategy.getFilterName() + ") ===");

        // 1. Декодирование
        int[][] pixels = decoder.decode(inputPath);

        // 2. Изменение размера
        int[][] resizedPixels = resizer.resize(pixels, width, height);

        // 3. Применение фильтра (Стратегия)
        int[][] filteredPixels = strategy.applyFilter(resizedPixels);

        // 4. Кодирование и сохранение
        encoder.encodeAndSave(filteredPixels, outputPath);
    }
}