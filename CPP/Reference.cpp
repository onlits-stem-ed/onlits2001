#include<iostream>

using namespace std;

int add(int &x, int &y);

int main()
{
	int a, b, c;
	
	cout<<"Please enter a number: ";
	cin>>a;
	cout<<"Please enter another number: ";
	cin>>b;
	
	c = add(a, b);
	
	cout<<"The address of a is "<<&a<<endl;
	
	cout<<"The sum is "<<c<<endl;
	
	return 0;
}

int add(int &x, int &y)
{
	cout<<"The address of x is "<<&x<<endl;
	return x + y;	
}
