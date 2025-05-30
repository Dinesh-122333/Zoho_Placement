package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

public class Customer {
    private static int cid = 1;
    private int id;
    private String name;
    private String address;
    private long phone;

    public Customer(String name, String address, long phone) {
        this.id = cid++;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

//    getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

//  setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
