#include <stdio.h>
#include "c-in-depth/common.c"

int main(void)
{
    unsigned char x, mask = 1;
    printf("Enter an integer between (0 and 255): ");
    scanf("%hhu", &x);
    if (x > 255)
    {
        printf("Integer supplied cannot be greater than 255.\n");
        return 30;
    }
    displayBitsChar(x);

    // x = x & mask;

    displayBitsChar(x ^ mask);

    return 0;
}