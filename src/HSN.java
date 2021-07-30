public class HSN extends Base {
    private double sgst;
    private double cgst;
    private double igst;

    HSN(String title, String id, double sgst, double cgst, double igst) {
        super(title, id);
        this.cgst = cgst;
        this.sgst = sgst;
        this.igst = igst;
    }

    public double getSgst() {
        return sgst;
    }

    public double getCgst() {
        return cgst;
    }

    public double getIgst() {
        return igst;
    }
}
