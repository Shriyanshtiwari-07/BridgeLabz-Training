package com.oops.loanbuddy;

public abstract class LoanApplication implements Approvable{
	protected Applicant applicant;
    protected int term;               
    protected double interestRate;    
    private boolean approved;          

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    // EMI Formula implementation
    protected double calculateEMIBase(double principal) {
        double monthlyRate = interestRate / (12 * 100);
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, term)) /
               (Math.pow(1 + monthlyRate, term) - 1);
    }
}