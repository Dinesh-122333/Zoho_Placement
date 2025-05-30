package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private static int cid = 1;
    private int id;
    private String name;
    private double creditScore;
    private Map<Integer, List<Integer>> loansMap;

    public Customer(String name) {
        this.id = cid++;
        this.name = name;
        this.loansMap = new HashMap<>();
        this.creditScore = 400;
    }

//    getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, List<Integer>> getLoansMap() {
        return loansMap;
    }

    public double getCreditScore() { return creditScore; }

//    setter
    public void setLoansMap(Integer id,int loanid) {
        this.loansMap.putIfAbsent(id, new ArrayList<>());
        this.loansMap.get(id).add(loanid);
    }

    public void setCreditScore(double creditScore){
        this.creditScore = creditScore;
    }
}
