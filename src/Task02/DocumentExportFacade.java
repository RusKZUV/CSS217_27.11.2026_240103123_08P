package Task02;

public class DocumentExportFacade {
    private ExportStrategy strategy;
    private ContentViewer viewer;
    private MetadataStamp stamp;
    private DiskWriter writer;

    public DocumentExportFacade(ExportStrategy strategy) {
        this.strategy = strategy;
        this.viewer = new ContentViewer();
        this.stamp = new MetadataStamp();
        this.writer = new DiskWriter();
    }

    // Позволяет менять стратегию на лету
    public void setStrategy(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    // Единый метод для клиента
    public void exportReport(String documentName, String outputPath) {
        System.out.println("\n--- Начат экспорт документа: " + documentName + " ---");

        // 1. Получаем контент
        String rawContent = viewer.getContent(documentName);

        // 2. Применяем выбранную стратегию форматирования
        String formattedContent = strategy.formatDocument(rawContent);

        // 3. Добавляем метаданные (дату экспорта)
        String finalContent = stamp.addStamp(formattedContent);

        // 4. Сохраняем на диск
        writer.writeToDisk(finalContent, outputPath);
    }
}