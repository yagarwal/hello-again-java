public class Base {
    private String title;
    private String id;

    public Base(String title, String code) {
        this.title = title;
        this.id = code;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
}
