package Car;

public class BuildCar {

    private final int orderNumber;
    private final String model;
    private final String engineAndTransmission;
    private final String paint;
    private double price;
    private int quantity;

    public BuildCar(int orderNumber, String model, String engineAndTransmission, String paint) {
        this.orderNumber = orderNumber;
        this.model = model;
        this.engineAndTransmission = engineAndTransmission;
        this.paint = paint;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getModel() {
        return model;
    }

    public String getEngineAndTransmission() {
        return engineAndTransmission;
    }

    public String getPaint() {
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
                ", model='" + model + '\'' +
                ", engineAndTransmision='" + engineAndTransmission + '\'' +
                ", paint='" + paint + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
