package LLd_preparation.OnlyOOPs.ER_to_classfile.Zoho2time;

import java.util.*;

public class Company {
    private static int cid = 1;
    private int id;
    private String name;
//    private Map<Integer, Integer> companyVendorMap;
    private Map<Integer, List<Bills>> companyBills;

    public Company(String name) {
        this.id = cid++;
        this.name = name;
        this.companyBills = new HashMap<>();
    }

//    setter
    public void setCompanyBills(Map<Integer, List<Bills>> companyBills) {
        this.companyBills = companyBills;
    }

    //    getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, List<Bills>> getCompanyBills() {
        return companyBills;
    }
}
