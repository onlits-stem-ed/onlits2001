import java.util.*;

class FactorialScan {
	public static void main(String[] args) {
		int n, fact=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--)
		{
			fact = fact * i;
		}
		
		System.out.println("The factorial of " + n + " is " + fact + ".");
	}
}

