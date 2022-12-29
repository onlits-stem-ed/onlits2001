#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *p;
	p = (int *)malloc(sizeof(int));		//allocated memory dynamically in bytes
	printf("Enter a number: ");
	scanf("%d", p);
	printf("The input value is %d.", *p);
	free(p);
}

/*
	int a = 0;
	
	p = &a;
	
	printf("%d", a);
	printf("%d", *p);
	
	a	-	refer to value
	&a	-	refer to address
	
	p	-	refer to pointer's value	(which is address of another variable)
	&p	-	refer to pointer's address
	*p	-	refer to value of the variable (whose address is stored in the pointer)
	
	int main()
	{
		int p=10, q=20;
		swap(p, q);
	}
	
	void swap(int a, int b)
	{
	
	}
	
	call by value
	call by reference
	
	How much memory is required by a pointer?	Machine-architecture dependent (16-bit, 32-bit, 64-bit)
	
	int -	2 bytes, 4 bytes
	
	
	int main()
	{
		int age[10];	//40 bytes
		
		sort(age);
	}
	
	void sort(int *x)	//4 bytes
	{
		
	}
	
	struct Temp
	{
	
	
	};
	
	typedef struct temp FILE;
	
	typedef struct
	{
	
	}FILE;
	
	int main()
	{
		typedef int marks;
		marks english, maths, science;
		struct Temp *fp;
		FILE *fp;
	}
*/