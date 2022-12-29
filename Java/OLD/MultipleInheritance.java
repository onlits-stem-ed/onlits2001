interface A {
	public final int a=10;
	public void show();
}

interface B {
	public final int b=20;
	public void show();
}


class C implements A, B {
	
	private int c;
	public C() {
		c=30;
	}
	
		public void show() {					//override
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		}
}

class MultipleInheritanceTest
{
	public static void main(String[] args)
	{
		C obc = new C();
	
		obc.show();
	}
}

