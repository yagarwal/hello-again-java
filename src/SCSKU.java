public class SCSKU {
    private SKU sku;
    private SaleChannel saleChannel;
    private int stock;
    private boolean isActive;

    public SCSKU(SKU sku, SaleChannel saleChannel, int stock, boolean isActive) {
        this.sku = sku;
        this.saleChannel = saleChannel;
        this.stock = stock;
        this.isActive = isActive;
    }

    public SKU getSku() {
        return sku;
    }

    public SaleChannel getSaleChannel() {
        return saleChannel;
    }

    public int getStock() {
        return stock;
    }

    public boolean isActive() {
        return isActive;
    }
}
