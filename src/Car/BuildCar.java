package Car;

public class BuildCar {

    private final int orderNumber;
    private final ModelType model;
    private final String engineAndTransmission;
    private final PaintOptions paint;
    private double price;
    private int quantity;

    public BuildCar(int orderNumber, ModelType model, String engineAndTransmission, PaintOptions paint) {
        this.orderNumber = orderNumber;
        this.model = model;
        this.engineAndTransmission = engineAndTransmission;
        this.paint = paint;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ModelType getModel() {
        return model;
    }

    public String getEngineAndTransmission() {
        return engineAndTransmission;
    }

    public PaintOptions getPaint() {
        return paint;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BuildCar{" +
                "orderNumber=" + orderNumber +
                ", model=" + model +
                ", engineAndTransmission='" + engineAndTransmission + '\'' +
                ", paint=" + paint +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
