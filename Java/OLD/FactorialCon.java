import java.io.*;

class FactorialCon {
	public static void main(String[] args) {
		int n, fact=1;
		
		Console con = System.console();
		
		System.out.print("Please enter a number: ");
		n = Integer.parseInt(con.readLine());
		
		for(int i=n; i>=1; i--)
		{
			fact = fact * i;
		}
		
		System.out.println("The factorial of " + n + " is " + fact + ".");
		
		System.out.print("Please enter your password: ");
		
		char[] pass = new char[10];
		
		pass = con.readPassword();
		
		System.out.println("Your password is: " + pass);
	}
}