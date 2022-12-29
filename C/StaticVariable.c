#include<stdio.h>

void variable();

int main()
{
	int i;
	
	for(i=1; i<=5; i++)
	{
		variable();
	}
	
	return 0;
}

void variable()
{
	auto signed int a;			//auto or local variable. Here auto is storage class
	static int z;
	
	printf("The value of a is %d.\n",a);
	printf("The value of z is %d.\n",z);
	
	a++;
	z++;
}

/*
	Scope, Visibility and Lifetime of a variable
*/
