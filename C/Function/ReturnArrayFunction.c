#include <stdio.h>
#include <stdlib.h>

void factors(int n, int *arr, int *size);

int main(void)
{
    int n, size = 0, arr[100];
    printf("Enter a number: ");
    scanf("%d", &n);
    factors(n, arr, &size);
    printf("The factors of %d are: ", n);
    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);

    printf("\n");
    return 0;
}

void factors(int n, int *arr, int *size)
{
    // int *arr = calloc(100, sizeof(int));
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            arr[*size] = i;
            (*size)++;
        }
    }
}