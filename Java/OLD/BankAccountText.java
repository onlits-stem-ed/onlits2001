import java.util.Scanner;

class BankAccount {
	private String depname;
	private String acno;
	private String actype;
	private float bal;
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("List of services:");
		System.out.println("1. New Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Display Balance");
		System.out.println("5. Exit");
		System.out.print("Enter choice: ");
		int ch = scan.nextInt();
		switch(ch) {
			case 1:
				newAccount();
				menu();
				break;
			case 2:
				deposit();
				menu();
				break;
			case 3:
				withdraw();
				menu();
				break;
			case 4:
				displayBalance();
				menu();
				break;
			case 5:
				System.out.println("Thank you for using this application!");
				break;
			default:
				System.out.println("Invalid option!");
				menu();
		}
	}
	
	public void newAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Depositor Name: ");
		depname = scan.nextLine();
		System.out.print("Enter Accout Number: ");
		acno = scan.next();
		System.out.print("Enter Account Type: ");
		actype = scan.next();
		System.out.print("Enter Balance: ");
		bal = scan.nextFloat();
		System.out.println("Account created successfully!");
	}
	
	public void deposit() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		float amt = scan.nextFloat();
		bal = bal + amt;
		System.out.println(amt + " deposited successfully!");
	}
	
	public void withdraw() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		float amt = scan.nextFloat();
		if(amt<=bal) {
			bal = bal - amt;
			System.out.println(amt + " withdrawn successfully!");
		}
		else {
			System.out.println("Transaction declined! Insufficient balance!");
		}
	}
	
	public void displayBalance() {
		System.out.println("Depositor Name: " + depname);
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + actype);
		System.out.println("Balance: " + bal);
	}
}

class BankAccountTest {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.menu();
	}
}

/*
C-style string - char name[30];
C++-style string - string name;
*/