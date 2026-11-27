package Task04;

public class Main4 {
    public static void main(String[] args) {
        String[] files = {"document1.txt", "image.png", "data.csv"};

        // Инициализируем фасад стратегией без сжатия
        ArchiveFacade facade = new ArchiveFacade(new NoCompression());
        facade.createArchive(files, "archive_uncompressed.zip");

        // Меняем на Run-Length
        facade.setStrategy(new RunLengthCompression());
        facade.createArchive(files, "archive_rle.zip");

        // Меняем на Dictionary
        facade.setStrategy(new DictionaryCompression());
        facade.createArchive(files, "archive_dict.zip");
    }
}