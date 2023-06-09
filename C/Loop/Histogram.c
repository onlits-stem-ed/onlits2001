#include <stdio.h>

#define SIZE 5

int main(void)
{
    int n[SIZE], lg = 0, i, j;

    printf("Enter %d integers below in the range 1 to 50:\n", SIZE);
    for(i=0; i<SIZE; i++)
    {
        scanf("%d", &n[i]);
        if (n[i] > lg)
            lg = n[i];
    }

    for(i=lg; i>=1; i--)
    {
        for(j=0; j<SIZE; j++)
        {
            if(i-n[j]<=0)
            {
                printf("=\t");
            }
            else
            {
                printf("\t");
            }
        }
        printf("\n");
    }
    for(i=0; i<SIZE; i++)
        printf("%d\t", n[i]);

    printf("\n");
    return 0;
}