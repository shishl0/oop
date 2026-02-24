package lab2.problem3;

public class Account {

    protected double balance;
    protected int accNumber;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        if (sum > 0)
            balance += sum;
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance)
            balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account #" + accNumber +
               ", Balance: $" + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}