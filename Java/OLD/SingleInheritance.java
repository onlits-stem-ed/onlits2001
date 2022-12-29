class A {
	private int a;
	public A() {
		a=10;
	}
	public void showa() {
		System.out.println("a=" + a);
	}
}

class B extends A {
	private int b;
	public B() {
		b=20;
	}
	public void showb() {
		System.out.println("b=" + b);
	}
}

class SingleInheritance {
	public static void main(String[] args) {
		B obb = new B();
	
		obb.showa();
		obb.showb();
	}
}