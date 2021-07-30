public class SKU {
    private Product product;
    private double sp;
    private String id;
    private Shipping[] shipping;

    SKU(Product product, double sp, String id, Shipping[] shipping) {
        this.product = product;
        this.sp = sp;
        this.id = id;
        this.shipping = shipping;
    }

    public Product getProduct() {
        return product;
    }

    public double getSp() {
        return sp;
    }

    public String getId() {
        return id;
    }

    public Shipping[] getShipping() {
        return shipping;
    }
}
