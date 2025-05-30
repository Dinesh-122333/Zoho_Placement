package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

import java.util.*;
import java.util.Scanner;

public class Bank{
    Scanner sc = new Scanner(System.in);
    private String name;
    private Map<Integer, Loans> loansMap;
    private Personal personal = new Personal();
    private Gold gold = new Gold();

    public Bank() {
        this.loansMap = new HashMap<>();
    }


    public Loans applyLoan(String category, int tenure, double principleAmt,double income, double  creditScore){
        if (category.equals("Personal")) {
            return personal.loansProcessing(tenure, principleAmt, income, creditScore);
        } else if (category.equals("Gold")) {
            return gold.loansProcessing(tenure, principleAmt, income, creditScore);
        }

        return null;
    }

    public void setInterest(){
        System.out.print("Enter the Personal loan interest rate: ");
        double personalInterest = sc.nextDouble();
        personal.setInterestRate(personalInterest);

        System.out.print("Enter the Gold loan interest rate: ");
        double goldInterest = sc.nextDouble();
        gold.setInterestRate(goldInterest);

    }

    public void setLoansMap(Integer id, Loans loans) {
        this.loansMap.putIfAbsent(id, loans);
    }

    //    getter
    public String getName() {
        return name;
    }

    public Map<Integer, Loans> getLoansMap() {
        return loansMap;
    }
}