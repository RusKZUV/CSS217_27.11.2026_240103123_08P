package Task06;

public class HighContrastFilter implements FilterStrategy {
    @Override
    public int[][] applyFilter(int[][] pixelMatrix) {
        System.out.println("[Filter] Применение фильтра: Высокий контраст");
        int[][] result = new int[pixelMatrix.length][3];
        for (int i = 0; i < pixelMatrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                // Усиление контраста (простая формула)
                int val = pixelMatrix[i][j];
                int contrasted = (val - 128) * 2 + 128;
                result[i][j] = Math.max(0, Math.min(255, contrasted));
            }
        }
        return result;
    }

    @Override
    public String getFilterName() { return "High Contrast"; }
}