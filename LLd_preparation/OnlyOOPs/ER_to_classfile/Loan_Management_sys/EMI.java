package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

public class EMI {

    double emi(double interest, int tenuere, double principal){

        double annualInterest = interest / 100 * 12;

        double num = (principal * annualInterest) * Math.pow((1 + annualInterest), tenuere);
        double deno = Math.pow((1 + annualInterest), tenuere) - 1;

        double emi = num / deno;
        System.out.println(emi);

        return emi;
    }
}
