/*P14.6 Clear rightmost 1 bit*/
#include <stdio.h>
#include "common.c"

int main(void)
{
    unsigned n = 2000;
    printf("%-8s:\t", "n");
    displayBits(n);
    printf("%-8s:\t", "n-1");
    displayBits(n - 1);
    printf("%-8s:\t", "n&(n-1)");
    n = n & (n - 1);
    displayBits(n);
    return 0;
}