package Task02;

public class CsvExport implements ExportStrategy {
    @Override
    public String formatDocument(String content) {
        // Имитация перевода текста в CSV (разделение по строкам)
        String[] lines = content.split("\n");
        StringBuilder csv = new StringBuilder("Header1,Header2\n");
        for (String line : lines) {
            csv.append(line.replace(" ", ",")).append("\n");
        }
        return csv.toString();
    }
}