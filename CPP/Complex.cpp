<<<<<<< HEAD
#include<iostream>

using namespace std;

class complex
{
	private:
		float real;
		float imag;
		const float pi=3.14;
		
	public:
		void set()
		{
			cout<<"Please enter real part: ";
			cin>>real;
	
			//cout<<"Please enter imaginary part: ";
			//cin>>imag;
			imag=1.5;
		}
		void get()
		{
			cout<<"real: "<<real<<"  imag: "<<imag<<endl;
		}
};

int main()
{
	complex c;
	
	c.set();
	c.get();
	
	return 0;
}

/*
	In the above program we have violeted encapsulation	
	
*/

=======
#include<iostream>

using namespace std;

class complex
{
	private:
		float real;
		float imag;
		const float pi=3.14;
		
	public:
		void set()
		{
			cout<<"Please enter real part: ";
			cin>>real;
	
			//cout<<"Please enter imaginary part: ";
			//cin>>imag;
			imag=1.5;
		}
		void get()
		{
			cout<<"real: "<<real<<"  imag: "<<imag<<endl;
		}
};

int main()
{
	complex c;
	
	c.set();
	c.get();
	
	return 0;
}

/*
	In the above program we have violeted encapsulation	
	
*/

>>>>>>> a8223819cb6bfb5d6ae4a479581df51dcea3df00
