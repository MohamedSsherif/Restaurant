package Models;

public class Restaurant {
    private int Id;
    private String Name,phone,Address;

    public Restaurant(int id, String name, String phone, String address) {
        Id = id;
        Name = name;
        this.phone = phone;
        Address = address;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return Address;
    }
}
