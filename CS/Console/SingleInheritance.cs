using System;

class A
{
	private int a;
	public A()
	{
		a=10;
	}
	public void showa()
	{
		Console.WriteLine("a=" + a);
	}
}

class B : A
{
	private int b;
	public B()
	{
		b=20;
	}
	public void showb()
	{
		Console.WriteLine("b=" + b);
	}
}

class SingleInheritance
{
	public static void Main(string[] args)
	{
		B obb = new B();
	
		obb.showa();
		obb.showb();
	}
}