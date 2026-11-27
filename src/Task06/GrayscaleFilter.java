package Task06;

public class GrayscaleFilter implements FilterStrategy {
    @Override
    public int[][] applyFilter(int[][] pixelMatrix) {
        System.out.println("[Filter] Применение фильтра: Оттенки серого");
        int[][] result = new int[pixelMatrix.length][3];
        for (int i = 0; i < pixelMatrix.length; i++) {
            int r = pixelMatrix[i][0];
            int g = pixelMatrix[i][1];
            int b = pixelMatrix[i][2];
            // Формула яркости
            int gray = (int) (0.299 * r + 0.587 * g + 0.114 * b);
            result[i][0] = gray;
            result[i][1] = gray;
            result[i][2] = gray;
        }
        return result;
    }

    @Override
    public String getFilterName() { return "Grayscale"; }
}