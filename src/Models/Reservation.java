package Models;

import Models.User;

import java.util.Objects;

public class Reservation {
    private int id;
    private User user;
    private int tableNumber;

    public Reservation() {
    }

    public Reservation(User user, int tableNumber){
        this.id = tableNumber;
        this.user = user;
        this.tableNumber = tableNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Reservation)) return false;
        return this.tableNumber == ((Reservation) o).tableNumber;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
