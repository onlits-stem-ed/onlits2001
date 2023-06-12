#include<stdio.h>
#include "CommonSupport.c"

int main()
{
    int arr1[] = {1, 3, 5, 7, 9};
    int arr2[] = {2, 4, 6, 8, 10};
    int arr3[10];

    for(int i=0; i<5; i++)                  //copy elements of arr1 to arr3
        arr3[i] = arr1[i];

    for(int i=0; i<5; i++)
        arr3[i+5] = arr2[i];

    printf("The contents of arr1 is:\n");
    display(arr1, 5);

    printf("The contents of arr2 is:\n");
    display(arr2, 5);

    printf("The contents of arr3 is:\n");
    display(arr3, 10);

    selection_sort(arr3, 10);

    printf("The contents of arr3 after sorting is:\n");
    display(arr3, 10);

    return 0;
}