public class School {
    private String title;
    private String image;
    private String address;
    private String city;
    private String code;
    private String state;
    private Board board;

    School(String title, String image, String address, String city, String id, String state, Board board) {
        this.title = title;
        this.address = address;
        this.image = image;
        this.city = city;
        this.code = id;
        this.state = state;
        this.board = board;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public Board getBoard() {
        return board;
    }
}
