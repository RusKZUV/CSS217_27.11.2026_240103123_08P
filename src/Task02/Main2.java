package Task02;

public class Main {
    public static void main(String[] args) {
        // Инициализируем фасад с начальной стратегией (PlainText)
        DocumentExportFacade facade = new DocumentExportFacade(new PlainTextExport());

        // 1. Экспорт в Plain Text
        facade.exportReport("Q3_Financials", "report.txt");

        // 2. Меняем стратегию на лету и экспортируем в CSV
        facade.setStrategy(new CsvExport());
        facade.exportReport("Q3_Financials", "report.csv");

        // 3. Меняем стратегию на Markdown
        facade.setStrategy(new MarkdownExport());
        facade.exportReport("Q3_Financials", "report.md");
    }
}