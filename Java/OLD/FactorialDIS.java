import java.io.*;

class FactorialDIS {
	public static void main(String[] args) throws IOException {
		int n, fact=1;
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Please enter a number: ");
		n = Integer.parseInt(dis.readLine());
		for(int i=n; i>=1; i--)
		{
			fact = fact * i;
		}
		
		System.out.println("The factorial of " + n + " is " + fact + ".");
	}
}

