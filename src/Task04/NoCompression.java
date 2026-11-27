package Task04;

public class NoCompression implements CompressionStrategy {
    @Override
    public String compress(String data) {
        System.out.println("[No Compression] Данные сохраняются как есть.");
        return data;
    }

    @Override
    public String getStrategyName() {
        return "No Compression";
    }
}