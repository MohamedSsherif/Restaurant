package Models;

public class Food {
    private String Name;
    private double Price,Quantity;

    public Food(String name, double price, double quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
