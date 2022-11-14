public class GameProduct {

    private String name;
    private int units;
    private double price;

    public GameProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GameProduct{" +
                "name='" + name + '\'' +
                ", units=" + units +
                ", price=" + price +
                '}';
    }
}
