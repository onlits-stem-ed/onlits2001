<<<<<<< HEAD
import java.util.Scanner;

class Complex
{

	private float real;
	private float imag;
	
	void Set()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter real part: ");
		real = sc.nextFloat();
	
		System.out.print("Please enter imaginary part: ");
		imag = sc.nextFloat();
	}
	void Get()
	{
		System.out.println("real: " + real + "  imag: " + imag);
	}
};

class ComplexTry
{
	public static void main(String[] args)
	{
		Complex c;
		c = new Complex();
		
		c.real=6.7F;
		
		c.Set();
		c.Get();
	}
}

/*
	In the above program we have violeted encapsulation	
	Managed Program	-	program that are targeted toward CLR
	
	public, private, protected, default
*/
=======
import java.util.Scanner;

class Complex
{

	private float real;
	private float imag;
	
	void Set()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter real part: ");
		real = sc.nextFloat();
	
		System.out.print("Please enter imaginary part: ");
		imag = sc.nextFloat();
	}
	void Get()
	{
		System.out.println("real: " + real + "  imag: " + imag);
	}
};

class ComplexTry
{
	public static void main(String[] args)
	{
		Complex c;
		c = new Complex();
		
		c.real=6.7F;
		
		c.Set();
		c.Get();
	}
}

/*
	In the above program we have violeted encapsulation	
	Managed Program	-	program that are targeted toward CLR
	
	public, private, protected, default
*/
>>>>>>> a8223819cb6bfb5d6ae4a479581df51dcea3df00
