public class Order {
    private String id;
    private SCSKU[] items;
    private Customer customer;
    private Address address;
    private double grandTotal;
    private int status;

    public Order(String id, SCSKU[] items, Customer customer, Address address, double grandTotal, int status) {
        this.id = id;
        this.items = items;
        this.customer = customer;
        this.address = address;
        this.grandTotal = grandTotal;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public SCSKU[] getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getAddress() {
        return address;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public int getStatus() {
        return status;
    }
}
