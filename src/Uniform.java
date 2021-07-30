public class Uniform extends Product {
    private String sizeName;
    private String season;
    private School school;
    private String standard;

    Uniform(String title, String description, String id, String primaryImage, String[] secondaryImages, String brand,
            Category category, String hsn, double mrp, String sizeName, String season, School school, String standard) {
        super(title, description, id, primaryImage, secondaryImages, brand, category, hsn, mrp);
        this.sizeName = sizeName;
        this.season = season;
        this.school = school;
        this.standard = standard;
    }

    public String getSizeName() {
        return sizeName;
    }

    public String getSeason() {
        return season;
    }

    public School getSchool() {
        return school;
    }

    public String getStandard() {
        return standard;
    }
}
