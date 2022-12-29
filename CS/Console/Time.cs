using System;

class Time
{
	int hh, mm, ss;
	
	public Time() {}							//Default Constructor
	
	public Time(int h, int m, int s)			//Parameterized Constructor
	{
		hh = h;
		mm = m;
		ss = s;
	}
	
	public Time(Time t)							//Copy Constructor
	{
		this.hh = t.hh;
		mm = t.mm;
		ss = t.ss;
	}
	
	public void GetTime(int h, int m, int s)
	{
		hh = h;
		mm = m;
		ss = s;
	}
	
	public void Display()
	{
		Console.WriteLine(hh + ":" + mm + ":" + ss);
	}
	
	public Time AddTime(Time t2)
	{
		Time t3 = new Time();
		
		t3.hh = hh + t2.hh;
		t3.mm = mm + t2.mm;
		t3.ss = ss + t2.ss;
		
		if(t3.ss > 60)
		{
			t3.mm++;
			t3.ss = t3.ss-60;
		}
		
		if(t3.mm>60)
		{
			t3.hh++;
			t3.mm = t3.mm-60;
		}
		
		return t3;
	}
	
	public static Time operator+(Time t1, Time t2)
	{
		Time t3 = new Time();
		
		t3.hh = t1.hh + t2.hh;
		t3.mm = t1.mm + t2.mm;
		t3.ss = t1.ss + t2.ss;
		
		if(t3.ss > 60)
		{
			t3.mm++;
			t3.ss = t3.ss-60;
		}
		
		if(t3.mm>60)
		{
			t3.hh++;
			t3.mm = t3.mm-60;
		}
		
		return t3;
	}
	public Time AddTime(int tv, int op)		//0-hr, 1-min, 2-sec	(default argument)
	{
		Time t3 = new Time(this);		//Here this is t2
		
		Console.WriteLine("Displaying t3 from AddTime");
		t3.Display();
		
		switch(op)
		{
			case 0:
				t3.hh = this.hh + tv;
				break;
			case 1:
				t3.mm = this.mm + tv;
				break;
			case 2:
				t3.ss = this.ss + tv;
				break;
			default:
				Console.WriteLine("Invalid option!");
				break;
		}
		
		return t3;
	}
}



class TimeMain
{
	static void Main()
	{
		Console.Write("Enter hour: ");
		int h = Convert.ToInt32(Console.ReadLine());
		Console.Write("Enter minute: ");
		int m = Convert.ToInt32(Console.ReadLine());
		Console.Write("Enter second: ");
		int s = Convert.ToInt32(Console.ReadLine());
		Time t1 = new Time(h,m,s);
		Console.Write("t1: ");
		t1.Display();
		
		Time t2 = new Time();
		t2.GetTime(11,45,32);
		Console.Write("t2: ");
		t2.Display();
		
		Time t3 = new Time();
		//t3 = t1.AddTime(t2);
		t3 = t1 + t2;
		Console.Write("t3: ");
		t3.Display();
		
		
		Time t4 = new Time();
		t4 = t2.AddTime(5,3);
		t4.Display();
	}
}
