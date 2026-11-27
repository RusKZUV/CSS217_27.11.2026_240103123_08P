package Task04;

public class FileReader {
    public String readFiles(String[] sourceFiles) {
        StringBuilder content = new StringBuilder();
        for (String file : sourceFiles) {
            // Имитация чтения файла
            content.append("Content of ").append(file).append("; ");
        }
        System.out.println("[FileReader] Прочитано файлов: " + sourceFiles.length);
        return content.toString();
    }
}