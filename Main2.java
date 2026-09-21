public class Main2 {
    public static void main(String[] args) {

        // ---- Sample data to load into the Purchase Log ----
        PurchaseItem[] sampleItems = {
            new PurchaseItem("Bread", 3.49),
            new PurchaseItem("Milk", 2.99),
            new PurchaseItem("Eggs", 4.29),
            new PurchaseItem("Coffee", 8.99),
            new PurchaseItem("Bananas", 1.29),
            new PurchaseItem("Cereal", 4.79),
            new PurchaseItem("Chicken Breast", 9.99),
            new PurchaseItem("Paper Towels", 6.49)
        };

        PurchaseLog log = new PurchaseLog();

        // Add all sample items to the purchase log.
        for (PurchaseItem item : sampleItems) {
            log.addItem(item);
        }

        System.out.println("Purchase Log loaded with " + log.itemCount() + " items.");

        // Example test call - findItemByName.
        PurchaseItem found = log.findItemByName("Coffee");
        System.out.println("Looked up 'Coffee', found: " +
            (found != null ? found.getName() + " $" + found.getPrice() : "NOT FOUND"));

        // Test updatePrice.
        log.updatePrice("Coffee", 9.49);
        found = log.findItemByName("Coffee");

        if (found != null) {
            System.out.println("New Coffee price: $" + found.getPrice());
        }

        // Test printDailyReport.
        System.out.println();
        log.printDailyReport();


        // ---- Sample data to load into the Checkout Line ----
        Customer[] sampleCustomers = {
            new Customer("Alvarez", 12),
            new Customer("Chen", 3),
            new Customer("Patel", 27),
            new Customer("O'Brien", 1)
        };

        CheckoutLine line = new CheckoutLine();

        // Add all customers to the back of the line.
        for (Customer customer : sampleCustomers) {
            line.addToBack(customer);
        }

        System.out.println();
        System.out.println("Checkout Line loaded, size = " + line.size());

        // Example test call - addToFront.
        Customer express = new Customer("Nguyen", 1);
        System.out.println("Waving " + express.getName() + " to the front...");
        line.addToFront(express);

        // Test removeFromFront.
        Customer served = line.removeFromFront();

        if (served != null) {
            System.out.println("Served first: " + served.getName());
        }

        // Test removeFromBack.
        Customer left = line.removeFromBack();

        if (left != null) {
            System.out.println("Left from back: " + left.getName());
        }

        // Print the final line size.
        System.out.println("Checkout Line final size = " + line.size());
    }
}