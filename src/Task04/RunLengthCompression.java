package Task04;

public class RunLengthCompression implements CompressionStrategy {
    @Override
    public String compress(String data) {
        // Имитация алгоритма RLE (Run-Length Encoding)
        System.out.println("[RLE] Выполняется сжатие методом повторяющихся символов...");
        return "[RLE-COMPRESSED] " + data.hashCode();
    }

    @Override
    public String getStrategyName() {
        return "Run-Length Compression";
    }
}