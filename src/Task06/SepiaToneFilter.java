package Task06;

public class SepiaToneFilter implements FilterStrategy {
    @Override
    public int[][] applyFilter(int[][] pixelMatrix) {
        System.out.println("[Filter] Применение фильтра: Сепия");
        int[][] result = new int[pixelMatrix.length][3];
        for (int i = 0; i < pixelMatrix.length; i++) {
            int r = pixelMatrix[i][0];
            int g = pixelMatrix[i][1];
            int b = pixelMatrix[i][2];

            int newR = (int) (0.393 * r + 0.769 * g + 0.189 * b);
            int newG = (int) (0.349 * r + 0.686 * g + 0.168 * b);
            int newB = (int) (0.272 * r + 0.534 * g + 0.131 * b);

            result[i][0] = Math.min(255, newR);
            result[i][1] = Math.min(255, newG);
            result[i][2] = Math.min(255, newB);
        }
        return result;
    }

    @Override
    public String getFilterName() { return "Sepia Tone"; }
}