package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

public class Items {
    private static int itemid = 1;
    private int id;
    private String name;
    private double amount;

    public Items(String name, double amount){
        this.id = itemid++;
        this.name = name;
        this.amount = amount;
    }

//  getter & setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
