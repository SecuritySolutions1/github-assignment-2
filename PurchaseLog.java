import java.util.ArrayList;

public class PurchaseLog {

    // Stores the PurchaseItem records.
    private ArrayList<PurchaseItem> items = new ArrayList<>();

    public void addItem(PurchaseItem item) {
        items.add(item);
    }

    public PurchaseItem findItemByName(String name) {
        for (PurchaseItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }

        return null;
    }

    public void updatePrice(String name, double newPrice) {
        PurchaseItem item = findItemByName(name);

        if (item != null) {
            item.setPrice(newPrice);
        }
    }

    public void printDailyReport() {
        double totalRevenue = 0;
        PurchaseItem bestSeller = null;

        for (PurchaseItem item : items) {
            totalRevenue = totalRevenue + item.getPrice();

            if (bestSeller == null ||
                    item.getPrice() > bestSeller.getPrice()) {
                bestSeller = item;
            }
        }

        System.out.println("Daily Report");
        System.out.println("Total items sold: " + items.size());
        System.out.printf("Total revenue: $%.2f%n", totalRevenue);

        if (bestSeller != null) {
            System.out.println("Best seller: " + bestSeller.getName());
        }
    }

    public int itemCount() {
        return items.size();
    }
}