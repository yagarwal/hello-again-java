public class EducationalToy extends Product {
    private Subject subject;

    EducationalToy(String title, String description, String id, String primaryImage, String[] secondaryImages, String brand,
                   Category category, String hsn, double mrp, Subject subject) {
        super(title, description, id, primaryImage, secondaryImages, brand, category, hsn, mrp);
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }
}
