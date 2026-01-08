package com.oops.loanbuddy;

public class HomeLoan extends LoanApplication{
	
	public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 700 &&
                           applicant.getIncome() >= 50000;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        // Home loans give 10% subsidy
        double discountedAmount = applicant.getLoanAmount() * 0.90;
        return calculateEMIBase(discountedAmount);
    }
}
