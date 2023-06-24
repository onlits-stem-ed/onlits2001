#include <stdio.h>
#include "common.c"

int main(void)
{
    int x;
    printf("Enter an integer: ");
    scanf("%d", &x);
    displayBits(x);
    return 0;
}