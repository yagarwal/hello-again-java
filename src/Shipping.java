public class Shipping extends Base {
    private String startPin;
    private String endPin;
    private double cost;

    Shipping(String title, String id, String startPin, String endPin, double cost) {
        super(title, id);
        this.startPin = startPin;
        this.endPin = endPin;
        this.cost = cost;
    }

    public String getStartPin() {
        return startPin;
    }

    public String getEndPin() {
        return endPin;
    }

    public double getCost() {
        return cost;
    }
}
