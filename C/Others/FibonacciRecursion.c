#include<stdio.h>
int fibonacci(int n);
int main()
{
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("The %dth fibonacci term is %d.\n", n, fibonacci(n));
    return 0;
}

int fibonacci(int n)
{
    if(n <= 1)
        return n;
    return fibonacci(n-1) + fibonacci(n-2);     //recursive call
}