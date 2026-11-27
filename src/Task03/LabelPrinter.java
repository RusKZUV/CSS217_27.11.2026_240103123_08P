package Task03;

public class LabelPrinter {
    public void printLabel(String orderId, String boxType, double cost, String strategyName, String deliveryTime) {
        System.out.println("=====================================");
        System.out.println("        SHIPPING DISPATCH LABEL      ");
        System.out.println("=====================================");
        System.out.println("Order ID     : " + orderId);
        System.out.println("Packaging    : " + boxType);
        System.out.println("Service      : " + strategyName);
        System.out.println("Delivery Time: " + deliveryTime);
        System.out.println("Total Cost   : $" + String.format("%.2f", cost));
        System.out.println("=====================================");
    }
}