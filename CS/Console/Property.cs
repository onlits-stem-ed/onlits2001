class ClassA
{
	int _x;
	
	public ClassA(int y)
	{
		_x=y;
	}
	
	public void Getx(int y)
	{
		_x=y;
	}
	
	
	public int Putx()
	{
		return _x;
	}
	
	
	public int x
	{
		get 
		{
			return _x;
		}
		set {;}
		
	}
}

class ClassAMain
{
	static void Main()
	{
	
		ClassA a = new ClassA(10);
		
		System.Console.WriteLine(a.Putx());
		
		a.Getx(20);
		
		System.Console.WriteLine(a.Putx());
		
		a.x = 30;			//Encapsulation Violation
		
		System.Console.WriteLine(a.x);
		
	}
}


/*
	Wrapping up of data and method into a single unit called class.
	
	Data should be hidden (private)
*/