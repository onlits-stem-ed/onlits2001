/*
	Category 4 Function
	Function with no argument but one return value
*/

#include<stdio.h>

int add();			//Function Declaration/Prototype

int main()
{
	int c;
	c = add();					//Function Call
	printf("The sum is %d.\n", c);
	return 0;
}


//---------- Function Definition----------
int add()				//Function Header
{	
	int a, b, c;
	printf("Please enter a number: ");
	scanf("%d", &a);
	printf("Please enter another number: ");
	scanf("%d", &b);								//Function Body starts here
	c = a + b;	
	return c;
}									//Function Body ends here

/*
generic = for more than one situation

Although the above function has become generic but it is still
attached to a single type


*/

