#include<iostream>

using namespace std;

class variable
{
	private:
		int a;
		static int b;
	public:
		variable() {}
		
		variable(int x)
		{
			a = x;
			b++;
		}
		
		static void getb(int x)
		{
			b=x;
		}
		
		void display()
		{
			cout<<"a="<<a<<endl;
			cout<<"b="<<b<<endl;
		}
		
		~variable()
		{
			b--;
			cout<<"b="<<b<<endl;
		}
};

int variable :: b;


int main()
{
	variable v1(10);
	cout<<"Displaying v1:"<<endl;
	v1.display();
	
	variable v2(20);
	cout<<"Displaying v2:"<<endl;
	v2.display();
	
	variable v3(30);
	cout<<"Displaying v3:"<<endl;
	v3.display();
	
	return 0;
}
