#include <stdio.h>

#define MAX 5

int main()
{

    int arr[MAX];
    int f = 0;

    printf("Enetr %d elements in the array:\n", MAX);
    for (int i = 0; i < MAX; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < MAX; i++)
    {
        if (arr[i] == arr[0])
        {
            f++;
        }
    }
    
    if (f == MAX)
    {
        printf("All numbers are same.");
    }
    else
    {
        printf("Not same.");
    }
}