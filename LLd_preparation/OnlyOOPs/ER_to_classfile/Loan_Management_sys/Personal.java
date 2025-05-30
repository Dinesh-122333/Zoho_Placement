package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

public class Personal {
    private double interestRate;

    public Personal() {
    }

    Loans loansProcessing(int tenure, double principleAmt, double income, double creditScore){
        if (loanApproval(creditScore, income)){
            Loans loans = new Loans("Personal", tenure, getInterestRate(), principleAmt);
            loans.setStatus("Approved");
            return loans;
        }
        return null;
    }

    private boolean loanApproval(double creditScore, double income){
        return creditScore > 300 && income > 400000;
    }

//    getter
    public double getInterestRate() {
        return interestRate;
    }

//    setter

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
