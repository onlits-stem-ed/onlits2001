import java.io.*;

class FactorialBR {
	public static void main(String[] args) throws IOException {
		int n, fact=1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter a number: ");
		n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--)
		{
			fact = fact * i;
		}
		
		System.out.println("The factorial of " + n + " is " + fact + ".");

		new InputStreamReader(System.in).read();
	}
}

