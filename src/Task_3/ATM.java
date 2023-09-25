package Task_3;
//ATM INTERFACE

import java.util.Scanner;

public class ATM {

    // The user's bank account
    public BankAccount bankAccount;

    // Constructor
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Withdraws cash from the ATM
    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        withdraw(amount);
    }

    // Deposits cash into the ATM
    public void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        deposit(amount);
    }


    // Withdraws cash from the account
    private void withdraw(int amount) {
        if (bankAccount.getBalance() < amount) {
            System.out.println("Insufficient funds");
        }
        else
        {

        bankAccount.withdraw(amount);
        System.out.println("Amount Withdraw Sucessfully "+amount);
        }
    }

    // Deposits cash into the account
    private void deposit(int amount) {
        bankAccount.deposit(amount);
        System.out.println("Amount Deposited Sucessfully "+amount);
    }

    // Checks the account balance
    private void checkBalance() {
        System.out.println("Your account balance is: "+bankAccount.getBalance());
    }

         
    
    
    
    
    
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(1000);
        ATM atm = new ATM(bankAccount);

        int choice;
        Scanner scanner = new Scanner(System.in);
        do
        {
        System.out.println("ATM Menu");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.println("Please enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
            	atm.withdraw();
                break;
            case 2:
            	atm.deposit();
                break;
            case 3:
            	atm.checkBalance();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        	}
        
        }while(choice!=4);
        scanner.close();
    }
 
}
