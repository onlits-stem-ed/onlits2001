#include<stdio.h>

int main()
{
	char a='A', *p;
	
	p = &a;
	
	printf("The value of a is %d.\n", a);
	printf("The size of a is %ld byte(s).\n", sizeof(a));
	printf("The address of a is %p.\n", &a);
	printf("The size of a is %ld byte(s).\n", sizeof(p));
	printf("The address of a is %p.\n", &p);
	printf("The value of p (which is the address of a) is %p.\n", p);
	printf("The value of location (a) to which p is pointing is %d.\n", *p);
	return 0;
}
