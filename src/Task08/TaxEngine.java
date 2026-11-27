package Task08;

public class TaxEngine {
    public double calculateTax(double subtotal) {
        double tax = subtotal * 0.15; // 15% налог
        System.out.println("[TaxEngine] Рассчитан налог: $" + String.format("%.2f", tax));
        return tax;
    }
}