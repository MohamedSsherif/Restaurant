package Models;

public class OrderLine {
    private Food food;
    private double quantity;

    public OrderLine() {
    }

    public OrderLine(Food food , double quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return food.getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "food=" + food +
                '}' + ", quantity: " + quantity;
    }
}
