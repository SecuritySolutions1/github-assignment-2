import java.util.LinkedList;

public class CheckoutLine {

    // Stores the Customer records.
    private LinkedList<Customer> customers = new LinkedList<>();

    public void addToBack(Customer c) {
        customers.addLast(c);
    }

    public void addToFront(Customer c) {
        customers.addFirst(c);
    }

    public Customer removeFromFront() {
        if (customers.isEmpty()) {
            return null;
        }

        return customers.removeFirst();
    }

    public Customer removeFromBack() {
        if (customers.isEmpty()) {
            return null;
        }

        return customers.removeLast();
    }

    public int size() {
        return customers.size();
    }
}