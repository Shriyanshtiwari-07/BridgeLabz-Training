package com.encapsulation;

interface Loanable{
void applyForLoan(double amount);
double calculateLoanEligibility();
}
abstract class BankAccount{
private String accountNumber;
private String holderName;
private double balance;
BankAccount(String accountNumber,String holderName,double balance){
this.accountNumber=accountNumber;
this.holderName=holderName;
this.balance=balance;
}
public String getAccountNumber(){
return accountNumber;
}
public String getHolderName(){
return holderName;
}
public double getBalance(){
return balance;
}
public void deposit(double amount){
if(amount>0){
balance+=amount;
}
}
public void withdraw(double amount){
if(amount>0&&amount<=balance){
balance-=amount;
}
}
abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable{
SavingsAccount(String acc,String name,double bal){
super(acc,name,bal);
}
double calculateInterest(){
return getBalance()*0.04;
}
public void applyForLoan(double amount){
System.out.println("Loan applied for Savings Account");
}
public double calculateLoanEligibility(){
return getBalance()*5;
}
}
class CurrentAccount extends BankAccount implements Loanable{
CurrentAccount(String acc,String name,double bal){
super(acc,name,bal);
}
double calculateInterest(){
return getBalance()*0.02;
}
public void applyForLoan(double amount){
System.out.println("Loan applied for Current Account");
}
public double calculateLoanEligibility(){
return getBalance()*3;
}
}
public class BankTest{
static void processAccount(BankAccount acc){
System.out.println(acc.getHolderName());
System.out.println(acc.calculateInterest());
}
public static void main(String[] args){
BankAccount a1=new SavingsAccount("SB101","Amit",50000);
BankAccount a2=new CurrentAccount("CA201","Riya",80000);
BankAccount[] accounts={a1,a2};
for(BankAccount acc:accounts){
processAccount(acc);
}
}
}
