#include <stdio.h>
#include "c-in-depth/common.c"

int main(void)
{
    unsigned char x, mask = 0xaa;
    printf("Enter an integer between (0 and 255): ");
    scanf("%hhu", &x);
    if (x > 255)
    {
        printf("Integer supplied cannot be greater than 255.\n");
        return 30;
    }
    printf("Original number:\n");
    displayBitsChar(x);

    printf("Mask:\n");
    displayBitsChar(mask);

    printf("Final result:\n");
    displayBitsChar(x ^ mask);

    return 0;
}