#include <stdio.h>
#include "c-in-depth/common.c"

int main(void)
{
    int x;
    printf("Enter an integer: ");
    scanf("%d", &x);
    printf("Original value:\n");
    displayBits(x);
    printf("Complement:\n");
    displayBits(~x);
    return 0;
}