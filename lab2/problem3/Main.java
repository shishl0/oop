package lab2.problem3;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(1001, 5);
        CheckingAccount ca = new CheckingAccount(2001);

        bank.openAccount(sa);
        bank.openAccount(ca);

        sa.deposit(1000);
        ca.deposit(500);
        ca.withdraw(100);
        ca.deposit(50);
        ca.withdraw(20);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();
    }
}