class BankAccountBase{
    protected double balance;
    BankAccountBase(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        if(amount>0) balance+=amount;
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance) balance-=amount;
    }
    double getBalance(){
        return balance;
    }
}
class SavingsBankAccount extends BankAccountBase{
    private double interestRate;
    SavingsBankAccount(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    void addInterest(){
        balance+=balance*interestRate;
    }
}
class BankCustomer{
    private String name;
    private BankAccountBase account;
    BankCustomer(String name,BankAccountBase account){
        this.name=name;
        this.account=account;
    }
    void deposit(double amount){
        account.deposit(amount);
    }
    void withdraw(double amount){
        account.withdraw(amount);
    }
    double checkBalance(){
        return account.getBalance();
    }
}
public class BankApplication{
    public static void main(String[] args){
        SavingsBankAccount sa=new SavingsBankAccount(10000,0.05);
        BankCustomer c=new BankCustomer("Amit",sa);
        c.deposit(2000);
        c.withdraw(3000);
        sa.addInterest();
        System.out.println(c.checkBalance());
    }
}
