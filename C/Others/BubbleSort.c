#include <stdio.h>
#include "SortSupport.c"
void display(int *array);
int main()
{
    int array[] = {12, 5, 96, 33, 45};
    printf("Unsorted array:\n");
    display(array);

    for (int i=0; i<4; i++)                 //O(n^2)
    {
        for (int j=0;j<4; j++)            //O(n)
        {
            if (array[j] > array[j+1])
            {
                swap(&array[j], &array[j+1]);
            }
        }
    }

    printf("\nSorted array:\n");
    display(array);
}