/*
	DEMONSTRATING CATEGORY 5 FUNCTION
	Function that returns multiple values
*/

#include<stdio.h>

void divide(int *dd, int *dv, int *q, int *r);

int main()
{
	int dd, dv, q, r;
	printf("Please enter dividend: ");
	scanf("%d", &dd);
	printf("Please enter divisor: ");
	scanf("%d", &dv);
	
	divide(&dd, &dv, &q, &r);
	
	printf("Quotient: %d\n", q);
	printf("Remainder: %d\n", r);
	
	return 0;
}

void divide(int *dd, int *dv, int *q, int *r)
{
	*q = *dd / *dv;
	*r = *dd % *dv;
}
