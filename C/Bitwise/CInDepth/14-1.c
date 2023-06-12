#include <stdio.h>
#include "common.c"

int main(void)
{
    int a, b;
    printf("Enter values for a and b in hexadecimal: ");
    scanf("%x%x", &a, &b);

    printf("a=%X\n", a);        displayBits(a);
    printf("b=%X\n", b);        displayBits(b);
    printf("a&b=%X\n",a&b);     displayBits(a&b);
    printf("a|b=%X\n",a|b);     displayBits(a|b);
    printf("a^b=%X\n",a^b);     displayBits(a^b);
    printf("~a=%X\n",~a);       displayBits(~a);
    printf("~b=%X\n",~b);       displayBits(~b);
    printf("~(~a)=%X\n",~(~a));   displayBits(~(~a));

    return 0;
}