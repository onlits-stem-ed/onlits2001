using System;

static class variable
{
	private	static int a;
	private static int b;
	/*public variable() {}
		
	public variable(int x)
	{
		a = x;
		b++;
	}*/
		
	public static void getb(int x)
	{
		b=x;
	}
		
	public static void display()
	{
		Console.WriteLine("a=" + a);
		Console.WriteLine("b=" + b);
	}
		
	/*~variable()
	{
		b--;
		Console.WriteLine("b=" + b);
	}*/
}

class VariableMain
{
	static void Main()
	{
		/*variable v1 = new variable(10);
		Console.WriteLine("Displaying v1:");
		v1.display();
	
		variable v2 = new variable(20);
		Console.WriteLine("Displaying v2:");
		v2.display();
	
		variable v3 = new variable(30);
		Console.WriteLine("Displaying v3:");
		v3.display();*/
		
		variable.display();
		Console.WriteLine("Hello");	//Here Console is a class
		
		System.out.println()
		
		PrintStream out = new PrintStream();
	}
}
