#include<stdio.h>
int factorial(int n);
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("The factorial of %d is %d.\n", n, factorial(n));
    return 0;
}

int factorial(int n)
{
    if(n<=1)                //base condition (exit condition)
        return 1;
        
    return n * factorial(n-1);  //recursive call; //tail recursion
}