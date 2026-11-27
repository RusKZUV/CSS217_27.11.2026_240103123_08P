package Task04;

public class DictionaryCompression implements CompressionStrategy {
    @Override
    public String compress(String data) {
        // Имитация словарного сжатия (как в LZW)
        System.out.println("[Dictionary] Выполняется словарное сжатие...");
        return "[DICT-COMPRESSED] " + data.length() + " bytes mapped";
    }

    @Override
    public String getStrategyName() {
        return "Dictionary Compression";
    }
}