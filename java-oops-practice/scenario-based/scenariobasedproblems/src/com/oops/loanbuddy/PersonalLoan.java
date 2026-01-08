package com.oops.loanbuddy;

public class PersonalLoan extends LoanApplication {
	public PersonalLoan(Applicant applicant) {
        super(applicant, 36, 14.5); // default term & rate
    }

    public PersonalLoan(Applicant applicant, int term, double interestRate) {
        super(applicant, term, interestRate);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 650 &&
                           applicant.getIncome() >= 30000;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return calculateEMIBase(applicant.getLoanAmount());
    }
}

