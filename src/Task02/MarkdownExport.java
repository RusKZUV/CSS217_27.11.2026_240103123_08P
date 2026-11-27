package Task02;

public class MarkdownExport implements ExportStrategy {
    @Override
    public String formatDocument(String content) {
        return "# Document Report\n\n" + content + "\n\n*Generated via Strategy Pattern*";
    }
}