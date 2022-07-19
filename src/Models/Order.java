package Models;


import java.util.List;

public class Order {
    private Reservation reservation;

    List<OrderLine> orderLines;

    double totalPrice;

    public Order() {
    }

    public Order(Reservation reservation, List<OrderLine> orderLines) {
        this.reservation = reservation;
        this.orderLines = orderLines;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public double getTotalPrice(){
        totalPrice = 0;
        orderLines.forEach(item -> totalPrice += item.getItemPrice());
        return totalPrice;
    }


    @Override
    public String toString() {
        return "Order{" +
                "reservation=" + reservation.getUser().getName() +
                ", orderLines=" + orderLines.toString() +

                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
