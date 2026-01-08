package com.oops.loanbuddy;

public class AutoLoan extends LoanApplication{
	public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.0);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 600 &&
                           applicant.getIncome() >= 25000;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double amountWithFee = applicant.getLoanAmount() + 5000;
        return calculateEMIBase(amountWithFee);
    }
}