package LLd_preparation.OnlyOOPs.ER_to_classfile.Loan_Management_sys;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        Bank bank = new Bank();
        boolean loop = true;
        while(loop){
            System.out.println(" 1.Enter the customer details\n 2.Display customer details\n 3.Add loans");
            System.out.println(" 4.Apply loan");
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    Customer customer = new Customer(name);
                    System.out.println();


                    customerManager.setMap(customer.getId(), customer);
                    System.out.println("______________________________");
                    break;

                case 2:
                    Map<Integer, Customer> custMap = customerManager.getMap();
                    for (Map.Entry<Integer, Customer> cust: custMap.entrySet()){
                        System.out.println("Customer id: " + cust.getKey());
                        System.out.println("Customer name: " + cust.getValue().getName());
                        if(cust.getValue().getLoansMap() == null || cust.getValue().getLoansMap().isEmpty()) System.out.println("No EMI taken");
                        else{
                            List<Integer> key = cust.getValue().getLoansMap().get(cust.getKey());
                            Map<Integer, Loans> loansMap = bank.getLoansMap();

                            for (Map.Entry<Integer, Loans> loans : loansMap.entrySet()){
                                if (key.contains(loans.getKey())) {
                                    System.out.println("Loan id: " + loans.getKey());
                                    System.out.println("Loan Category: " + loans.getValue().getCategory());
                                    System.out.println("Loan Emi: " + loans.getValue().getEmi());
                                    System.out.println("Monthly pay: " + loans.getValue().getMonthly());
                                    System.out.println("Loan Tenure: " + loans.getValue().getTenure());
                                    System.out.println("Loan Intresest: " + loans.getValue().getInterest());
                                    System.out.println("Loan Status: " + loans.getValue().getStatus());
                                    System.out.println("Loan Prinicple Amount: " + loans.getValue().getPrincipleAmt());

                                    double totalAmt = loans.getValue().getPrincipleAmt() + loans.getValue().getEmi();
                                    System.out.println("Total amount to be payed: " + totalAmt);
                                }
                            }
                            System.out.println("$#########################$");
                        }
                        System.out.println("****************************");
                    }
                    System.out.println("______________________________");
                    break;

                case 3:
                    bank.setInterest();
                    System.out.println("______________________________");
                    break;

                case 4:
                    System.out.print("Enter your customerId: ");
                    int id = sc.nextInt();

                    System.out.print("Enter the loan type: ");
                    String loanType = sc.next();

                    System.out.print("Enter the number of years: ");
                    int tenure = sc.nextInt();

                    System.out.print("Enter the amt needed: ");
                    double amt = sc.nextDouble();

                    System.out.print("Enter your income as per annum: ");
                    double income = sc.nextDouble();

                    double creditScore = customerManager.getMap().get(id).getCreditScore();

                    Loans loans = bank.applyLoan(loanType, tenure, amt, income, creditScore);
                    loans.setEmi();

                    Map<Integer, Customer> customerMap = customerManager.getMap();
                    customerMap.get(id).setLoansMap(id, loans.getId());

                    bank.setLoansMap(loans.getId(), loans);
                    System.out.println("______________________________");
                    break;

                default:
                    loop = false;
                    sc.close();
                    break;

            }
        }
    }
}
