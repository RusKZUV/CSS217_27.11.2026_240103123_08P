package Task02;

public class ContentViewer {
    public String getContent(String documentName) {
        // В реальности здесь было бы чтение из БД или файла
        return "Report: " + documentName + "\nStatus: Approved\nRevenue: 15000";
    }
}