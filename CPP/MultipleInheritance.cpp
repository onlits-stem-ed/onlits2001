#include<iostream>

using namespace std;

class A
{
		int a;
	public:
		A()
		{
			a=10;
		}
		void show();
};

void A :: show()
{
	cout<<"a="<<a<<endl;
}

class B
{
		int b;
	public:
		B()
		{
			b=20;
		}
		void show();
};

void B :: show()
{
	cout<<"b="<<b<<endl;
}

class C : public A, public B
{
		int c;
	public:
		C()
		{
			c=30;
		}
		void showC();
};

void C :: showC()					//Overriding
{
	cout<<"c="<<c<<endl;
}


int main()
{
	C obc;
	
	obc.A::show();
	obc.B::show();
	obc.showC();
	
	return 0;
}

