/*
	Category 2 Function
	Function with argument but no return value
*/

#include<stdio.h>

void add(int, int);			//Function Declaration/Prototype

int main()
{
	int a, b;
	printf("Please enter a number: ");
	scanf("%d", &a);
	printf("Please enter another number: ");
	scanf("%d", &b);
	add(a, b);					//Function Call
	return 0;
}


//---------- Function Definition----------
void add(int x, int y)				//Function Header
{	
	int z;								//Function Body starts here
	z = x + y;	
	printf("The sum is %d.\n", z);
}									//Function Body ends here
