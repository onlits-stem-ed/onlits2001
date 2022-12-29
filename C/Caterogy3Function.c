/*
	Category 3 Function
	Function with argument and one return value
*/

#include<stdio.h>

int add(int, int);			//Function Declaration/Prototype

int main()
{
	int a, b, c;
	printf("Please enter a number: ");
	scanf("%d", &a);
	printf("Please enter another number: ");
	scanf("%d", &b);
	c = add(a, b);					//Function Call
	printf("The sum is %d.\n", c);
	return 0;
}


//---------- Function Definition----------
int add(int x, int y)				//Function Header
{	
	int z;								//Function Body starts here
	z = x + y;	
	return z;
}									//Function Body ends here

/*
generic = for more than one situation

Although the above function has become generic but it is still
attached to a single type
*/

