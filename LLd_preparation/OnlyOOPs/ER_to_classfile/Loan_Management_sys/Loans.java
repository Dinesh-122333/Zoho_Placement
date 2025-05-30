package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

public class Loans{
    private static int lid = 1;
    private int id;
    private String category;
    private double emi;
    private int tenure;
    private double interest;
    private double principleAmt;
    private double monthly;
    private EMI emiCalculator = new EMI();
    private String status;

    public Loans(String category, int tenure, double interest, double principleAmt) {
        this.id = lid++;
        this.category = category;
        this.tenure = tenure;
        this.interest = interest;
        this.principleAmt = principleAmt;
        this.status = "";
    }


//    setter
    public void setCategory(String category) {
        this.category = category;
    }

    public void setEmi() {
        this.emi = Math.round(emiCalculator.emi(interest, tenure, principleAmt) * 100.0) / 100.0;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setPrincipleAmt(double principleAmt) {
        this.principleAmt = principleAmt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //    getter
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getEmi() {
        return emi;
    }

    public int getTenure() {
        return tenure;
    }

    public double getInterest() {
        return interest;
    }

    public double getPrincipleAmt() {
        return principleAmt;
    }

    public String getStatus() {
        return status;
    }

    public double getMonthly(){
        int totMonths = 12 * getTenure();
        return  Math.round((getEmi() / totMonths) * 100.0)/ 100.0;

    }
}
