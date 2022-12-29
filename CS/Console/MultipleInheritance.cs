using System;

interface A
{
	
	public const int a=10;
	
	void show();
}

interface B
{
	const int b=20;
	
	void show();
}


class C : A, B
{
	int c;
	
	public C()
	{
		c=30;
	}
	public void show()
	{
		Console.WriteLine("c="+c);		//Overriding
	}
}


class MultipleInheritanceTest
{
	static void Main()
	{
		C obc = new C();
	
		obc.show();
	}
}
