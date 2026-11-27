package Task05;

public class BeanGrinder {
    public void grindBeans(String beanType) {
        System.out.println("[BeanGrinder] Помол зерен: " + beanType + "...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}