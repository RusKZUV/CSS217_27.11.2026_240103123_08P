package Task08;

public class InventoryLockService {
    public void lockItems(String orderId) {
        System.out.println("[Inventory] Товары для заказа " + orderId + " ЗАБЛОКИРОВАНЫ.");
    }

    public void releaseItems(String orderId) {
        System.out.println("[Inventory] Блокировка снята. Товары для заказа " + orderId + " возвращены на склад.");
    }
}