package lab2.problem3;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extra = transactionCount - FREE_TRANSACTIONS;
            balance -= extra * FEE;
        }
        transactionCount = 0; // reset for next period
    }

    @Override
    public String toString() {
        return "CheckingAccount #" + accNumber +
               ", Balance: $" + balance +
               ", Transactions: " + transactionCount;
    }
}