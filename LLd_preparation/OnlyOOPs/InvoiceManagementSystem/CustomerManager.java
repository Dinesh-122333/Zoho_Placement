package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

import java.util.*;

public class CustomerManager {
    Map<Integer, Customer> customerHashMap;

    public CustomerManager(){
        this.customerHashMap = new HashMap<>();
    }

//    getter
    public Map<Integer, Customer> getCustomerHashMap() {
        return customerHashMap;
    }

    //    setter
    public void setCustomerHashMap(int id, Customer cust) {
        this.customerHashMap.putIfAbsent(id, cust);
    }
}
