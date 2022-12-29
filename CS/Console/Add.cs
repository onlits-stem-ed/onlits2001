using System;

class Add
{
	public static void Main()
	{
		Int32 a, b, c;
		Console.Write("Please enter a number: ");
		
		a = Int32.Parse(Console.ReadLine());
		
		Console.Write("Please enter another number: ");
		b = Int32.Parse(Console.ReadLine());
		
		c = a + b;
		
		Console.WriteLine("The sum is " + c);
	}
}

/*
	Implicit	-	By itself
	Explicit	-	Do it clearly
*/