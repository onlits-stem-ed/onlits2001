#include <stdio.h>
#include "c-in-depth/common.c"

int main(void)
{
    int x, n;
    printf("Enter an integer: ");
    scanf("%d", &x);
    displayBits(x);
    printf("How many left shifts: ");
    scanf("%d", &n);
    displayBits(x << n);
    return 0;
}