using System;

class Complex
{

	float real;
	float imag;
	
	public void Set()
	{
		Console.Write("Please enter real part: ");
		real = Convert.ToSingle(Console.ReadLine());
	
		Console.Write("Please enter imaginary part: ");
		imag = Convert.ToSingle(Console.ReadLine());
	}
	public void Get()
	{
		Console.WriteLine("real: " + real + "  imag: " + imag);
	}
};

class ComplexTry
{
	static void Main()
	{
		Complex c;
		c = new Complex();
	
		c.Set();
		c.Get();
	}
}

/*
	In the above program we have violeted encapsulation	
	Managed Program	-	program that are targeted toward CLR
*/
