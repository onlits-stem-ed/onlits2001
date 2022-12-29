/*
	Category 1 Function
	Function with no argument and no return value
*/

#include<stdio.h>

void add();			//Function Declaration/Prototype

int main()
{
	add();			//Function Call
	return 0;
}


//---------- Function Definition----------
void add()			//Function Header
{					//Function Body starts here
	int a, b, c;
	printf("Please enter a number: ");
	scanf("%d", &a);
	printf("Please enter another number: ");
	scanf("%d", &b);
	c = a + b;	
	printf("The sum is %d.\n", c);
}					//Function Body ends here
