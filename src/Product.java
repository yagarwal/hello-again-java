public class Product extends Base {
    private String description;
    private String primaryImage;
    private String[] secondaryImages;
    private String brand;
    private Category category;
    private String hsn;
    private double mrp;

    Product(String title, String description, String id, String primaryImage, String[] secondaryImages, String brand,
            Category category, String hsn, double mrp) {
        super(title, id);
        this.description = description;
        this.primaryImage = primaryImage;
        this.secondaryImages = secondaryImages;
        this.brand = brand;
        this.category = category;
        this.hsn = hsn;
        this.mrp = mrp;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPrimaryImage() {
        return this.primaryImage;
    }

    public String[] getSecondaryImages() {
        return this.secondaryImages;
    }

    public String getBrand() {
        return this.brand;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getHSN() {
        return this.hsn;
    }

    public double getMRP() {
        return this.mrp;
    }
}
