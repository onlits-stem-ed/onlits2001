package local.onlits.onlits2001.book.balagurusamy;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("\n-------------------- Testing Savings Account----------------------");
        Account account = new SavingsAccount();
        System.out.println("\n---- Creating Savings Account----------------------");        
        account.createAccount();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Depositing Fund----------------------");        
        account.deposit();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Withdrawing Fund----------------------");        
        account.withdraw();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Calculate and Pay Interest----------------------");
        account.computeInterest();
        System.out.println("\n---- Displaying Balance----------------------");
        account.displayBalance();

        
        System.out.println("\n-------------------- Testing Current Account----------------------");
        account = new CurrentAccount();
        System.out.println("\n---- Creating Current Account----------------------");        
        account.createAccount();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Depositing Fund----------------------");        
        account.deposit();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Withdrawing Fund----------------------");        
        account.withdraw();
        System.out.println("\n---- Displaying Balance----------------------");        
        account.displayBalance();
        System.out.println("\n---- Minimum Balance Check----------------------");
        account.checkMinimumBalance();
        System.out.println("\n---- Displaying Balance----------------------");
        account.displayBalance();
    }   
}