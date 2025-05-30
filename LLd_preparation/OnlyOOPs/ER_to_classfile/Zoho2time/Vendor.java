package LLd_preparation.OnlyOOPs.ER_to_classfile.Zoho2time;

import java.util.*;

public class Vendor {
    private static int vid = 1;
    private int id;
    private String name;
    private Map<Integer, List<Integer>> vendorBillMap;//vendorid, List of billid
    private Map<Integer, List<Integer>> vendorCompanyMap;// vendorid, List of companyid;

    public Vendor(String name) {
        this.id = vid++;
        this.name = name;
        this.vendorBillMap = new HashMap<>();
        this.vendorCompanyMap = new HashMap<>();
    }

//    setter
    public void setVendorBillMap(Map<Integer, List<Integer>> vendorBillMap) {
        this.vendorBillMap = vendorBillMap;
    }

    public void setVendorCompanyMap(Map<Integer, List<Integer>> vendorCompanyMap) {
        this.vendorCompanyMap = vendorCompanyMap;
    }

//    Getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, List<Integer>> getVendorBillMap() {
        return vendorBillMap;
    }

    public Map<Integer, List<Integer>> getVendorCompanyMap() {
        return vendorCompanyMap;
    }
}
