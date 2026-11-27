package Task06;

public class Main6 {
    public static void main(String[] args) {
        // Инициализируем пайплайн с фильтром "Оттенки серого"
        ImagePipelineFacade pipeline = new ImagePipelineFacade(new GrayscaleFilter());
        pipeline.processImage("input_photo.jpg", 100, 100, "output_gray.txt");

        // Меняем фильтр на Сепию
        pipeline.setStrategy(new SepiaToneFilter());
        pipeline.processImage("input_photo.jpg", 100, 100, "output_sepia.txt");

        // Меняем фильтр на Высокий контраст
        pipeline.setStrategy(new HighContrastFilter());
        pipeline.processImage("input_photo.jpg", 100, 100, "output_contrast.txt");
    }
}