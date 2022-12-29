#include <stdio.h>
#include <stdlib.h>
int main()
{
    // int arr[5];              //static    (stack)
    int *arr;
    arr = (int *)malloc(5 * sizeof(int));       //dynamic -- heap

    printf("Enter 5 integers below:\n");
    for (int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nThe array contains following elements:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d\n", arr[i]);
    }
    return 0;
}