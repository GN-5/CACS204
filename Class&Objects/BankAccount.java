public class BankAccount {
    long acctNumber;
    double balance;

    BankAccount() {
    }

    BankAccount(long acctNo, double amount) {
        this.acctNumber = acctNo;
        this.balance = amount;
    }

    public long getAcctNumber() {
        return this.acctNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void transfer(BankAccount acct, double amount) {
        acct.balance = acct.balance + amount;
        this.balance = this.balance - amount;
    }
}
