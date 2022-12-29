#include<stdio.h>
int main()	            //--------O(n)
	{
		int array[] = {12, 5, 96, 33, 45}; //--------O(1)
		int search_value = 46;	//--------O(1)
		int i;

		for(i=0; i<5; i++)	//--------O(n)
		{
			if(search_value == array[i])
			{
				break;
			}
		}
        
		if(i>=5)
			printf("The search value was not found!\n");
		else
			printf("The search value was found at %d.\n", i);
			
		return 0;
	}
	