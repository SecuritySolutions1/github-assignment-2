import java.util.ArrayList;

public class CheckoutLineArray {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void addToBack(Customer c) {
        customers.add(c);
    }

    public void addToFront(Customer c) {
        customers.add(0, c);
    }

    public Customer removeFromFront() {
        if (customers.isEmpty()) {
            return null;
        }

        return customers.remove(0);
    }

    public Customer removeFromBack() {
        if (customers.isEmpty()) {
            return null;
        }

        return customers.remove(customers.size() - 1);
    }

    public int size() {
        return customers.size();
    }
}