package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

public class Gold {
    private double interestRate;

    public Gold() {
    }

    Loans loansProcessing(int tenure, double principleAmt, double income, double creditScore){
        if (loanApproval(creditScore, income)){
            Loans loans = new Loans("Gold", tenure, getInterestRate(), principleAmt);
            loans.setStatus("Approved");
            return loans;
        }
        return null;
    }

    private boolean loanApproval(double creditScore, double income){
        return creditScore > 200 && income > 200000;
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
