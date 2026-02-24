package lab2.problem3;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber() == accNumber);
    }

    public void update() {
        for (Account acc : accounts) {

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            }

            if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }
}