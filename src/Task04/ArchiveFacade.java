package Task04;

public class ArchiveFacade {
    private CompressionStrategy strategy;
    private FileReader reader;
    private ChecksumGenerator checksumGen;
    private ArchivePackager packager;

    public ArchiveFacade(CompressionStrategy strategy) {
        this.strategy = strategy;
        this.reader = new FileReader();
        this.checksumGen = new ChecksumGenerator();
        this.packager = new ArchivePackager();
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод для клиента: чтение, хеширование, сжатие и упаковка
    public void createArchive(String[] sourceFiles, String destination) {
        System.out.println("\n--- Запуск архивации: " + strategy.getStrategyName() + " ---");

        // 1. Чтение исходных файлов
        String rawData = reader.readFiles(sourceFiles);

        // 2. Вычисление контрольной суммы (до сжатия)
        String checksum = checksumGen.generateHash(rawData);

        // 3. Сжатие данных с помощью выбранной стратегии
        String compressedData = strategy.compress(rawData);

        // 4. Упаковка в архив
        packager.packageArchive(compressedData, checksum, destination);
    }
}