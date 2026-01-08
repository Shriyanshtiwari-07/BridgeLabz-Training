package com.oops.loanbuddy;

public class LoanBuddyApp {
	public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Nageshwar",
                720,
                60000,
                500000
        );

        LoanApplication loan = new HomeLoan(applicant, 240);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }
    }
}

