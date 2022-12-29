package local.onlits.onlits2001.book.balagurusamy;

import java.util.Scanner;

public abstract class Account {
    String customerName;
    String accountNumber;
    String typeOfAccount;
    float balance;

    Scanner scanner = new Scanner(System.in);

    Account() {
        balance = 0.0f;
    }

    void createAccount() {
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = scanner.next();
        scanner.nextLine();
    }   

    void deposit()
    {
        float amount;
        System.out.print("Enter amount: ");
        amount = scanner.nextFloat();
        balance += amount;
        System.out.println("Amount Deposited!");
    }

    void displayBalance() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type of Account: " + typeOfAccount);
        System.out.println("Balance: " + balance);
    }

    void withdraw() {
        float amount;
        System.out.print("Enter amount: ");
        amount = scanner.nextFloat();
        if(amount > balance) {
            System.out.println("Insufficient Funds! Transaction Declined!");
            return;
        }
        balance -= amount;
        System.out.println("Amount Withdrawn!");
    }

    void checkMinimumBalance()
    {

    }

    void computeInterest()
    {
        
    }
}
