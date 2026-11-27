package Task06;

public interface FilterStrategy {
    // Принимает матрицу пикселей (для простоты используем int[][]),
    // возвращает отфильтрованную матрицу
    int[][] applyFilter(int[][] pixelMatrix);
    String getFilterName();
}