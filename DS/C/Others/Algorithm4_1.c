/*
	PROGRAM TO TRAVERSE A LINEAR ARRAY
*/

#include<stdio.h>

int main()
{
	int la[] = {56, 23, 100, 78, 99};
	int lb=0, ub=4, k;
	
	k=lb;
	
	while(k<=ub)
	{
		printf("%d\n", la[k]);
		k++;
	}
	return 0;
}


/*
	Data Structure - By Seymour Lipsutz
*/
