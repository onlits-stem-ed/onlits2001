#include <stdio.h>

int main(void)
{
    int x, mask = 1;
    printf("Enter an integer: ");
    scanf("%d", &x);
    if ((x & mask) != 0)
        printf("1\n");
    else
        printf("0\n");
    return 0;
}