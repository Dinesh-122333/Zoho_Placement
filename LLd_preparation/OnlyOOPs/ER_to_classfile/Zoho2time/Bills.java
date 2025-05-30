package LLd_preparation.OnlyOOPs.ER_to_classfile.Zoho2time;

import java.util.*;

public class Bills {
    private static  int bid = 1;
    private int id;
    private double amount;
    private Date date;
    private String installmentStatus;
    private double balance;
    private Map<Integer, Integer> billsVendorMap;//billid, vendorid
    private Map<Integer, Bills> billsMap;//billid, bills

    public Bills(double amount, Date date) {
        this.id = bid++;
        this.amount = amount;
        this.date = date;
        this.installmentStatus = "No";
        this.balance = 0;
        this.billsVendorMap = new HashMap<>();
        this.billsMap = new HashMap<>();
    }

//    setter
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setInstallmentStatus(String installmentStatus) {
        this.installmentStatus = installmentStatus;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBillsVendorMap(Map<Integer, Integer> billsVendorMap) {
        this.billsVendorMap = billsVendorMap;
    }

    public void setBillsMap(Map<Integer, Bills> billsMap) {
        this.billsMap = billsMap;
    }

    //    getter
    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getInstallmentStatus() {
        return installmentStatus;
    }

    public double getBalance() {
        return balance;
    }

    public Map<Integer, Integer> getBillsVendorMap() {
        return billsVendorMap;
    }

    public Map<Integer, Bills> getBillsMap() {
        return billsMap;
    }
}
