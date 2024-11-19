package exerSecao9;

public class Conta {

    private final double WITHDRAW_FEE =  5;

    private int accountNumber;
    private String accountName;
    private double balance;

    public Conta(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public Conta(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double debit){
        this.balance -= (debit + WITHDRAW_FEE);
    }

    public String toString(){
        return "Account " + accountNumber + ", Holder: " + accountName + ", Balance: $" + String.format("%.2f", balance);
    }

}
