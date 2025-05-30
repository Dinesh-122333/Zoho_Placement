package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private final Map<Integer, Customer> map;

    public CustomerManager() {
        this.map = new HashMap<>();
    }

    //    getter
    public Map<Integer, Customer> getMap() {
        return map;
    }

//    setter
    public void setMap(int id, Customer c) {
        this.map.putIfAbsent(id, c);
    }
}
