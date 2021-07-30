public class Textbook extends Product {
    private String publisher;
    private School school;
    private String board;
    private Subject subject;
    private String standard;

    Textbook(String title, String description, String id, String primaryImage, String[] secondaryImages, String brand,
             Category category, String hsn, double mrp, String publisher, School school, String board, Subject subject, String standard) {
        super(title, description, id, primaryImage, secondaryImages, brand, category, hsn, mrp);
        this.publisher = publisher;
        this.school = school;
        this.board = board;
        this.subject = subject;
        this.standard = standard;
    }

    public String getPublisher() {
        return publisher;
    }

    public School getSchool() {
        return school;
    }

    public String getBoard() {
        return board;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getStandard() {
        return standard;
    }

}
