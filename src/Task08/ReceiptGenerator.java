package Task08;

public class ReceiptGenerator {
    public void generate(String orderId, String paymentMethod, double totalAmount) {
        System.out.println("=====================================");
        System.out.println("            RECEIPT                  ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Paid via : " + paymentMethod);
        System.out.println("Total    : $" + String.format("%.2f", totalAmount));
        System.out.println("Status   : PAID & CONFIRMED");
        System.out.println("=====================================");
    }
}