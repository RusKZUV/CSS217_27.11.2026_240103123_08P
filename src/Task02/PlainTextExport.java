package Task02;

public class PlainTextExport implements ExportStrategy {
    @Override
    public String formatDocument(String content) {
        return "--- PLAIN TEXT ---\n" + content;
    }
}