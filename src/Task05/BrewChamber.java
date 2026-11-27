package Task05;

public class BrewChamber {
    public void brew(int timeSeconds, String method) {
        System.out.println("[BrewChamber] Заваривание методом " + method + " в течение " + timeSeconds + " сек...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("[BrewChamber] Напиток готов!");
    }
}