package Task_3;
//ATM INTERFACE

public class BankAccount {

    // The account balance
    private int balance;

    // Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Withdraws cash from the account
    public void withdraw(int amount){
        if (balance < amount) {
           // System.out.println("Insufficient funds");
        }

        balance -= amount;
    }

    // Deposits cash into the account
    public void deposit(int amount) {
        balance += amount;
    }

    // Checks the account balance
    public int getBalance() {
        return balance;
    }
}
