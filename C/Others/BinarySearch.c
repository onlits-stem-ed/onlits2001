#include <stdio.h>
#include "CommonSupport.c"
#define SIZE 10
int main()
{
    int mid, lb = 0, ub = SIZE - 1, sv, i=0, flag=0;
    int array[] = {12, 89, 6, 44, 23, 2, 19, 99, 75, 63};
    printf("Enter the value to search: ");
    scanf("%d", &sv);
    printf("Array before sorting:\n");
    display(array, SIZE);
    selection_sort(array, SIZE);
    printf("Array after sorting:\n");
    display(array, SIZE);

    while (lb<ub)       //(log n)
    {
        // printf("lb = %d, ub = %d\n", lb, ub);
        mid = (lb + ub) / 2;
        i++;
        printf("mid(%d) is %d.\n", i, mid);

        if (sv == array[mid])
        {
            printf("Item found at index %d.\n", mid);
            flag = 1;
            break;
        }
        else
        {
            if (sv < array[mid])
            {
                ub = mid - 1;
            }
            else
            {
                lb = mid + 1;
            }
        }
    }

    if(flag==0)
    {
        printf("Item not found!\n");
    }    

    return 0;
}