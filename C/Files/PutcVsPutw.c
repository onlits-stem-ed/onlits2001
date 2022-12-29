#include <stdio.h>

int main()
{
    FILE *fpchar, *fpint;
    char c;
    int in;
    // fpchar = fopen("Character.txt", "w");
    // while ((c = getchar()) != EOF)
    // {
    //     putc(c, fpchar);
    // }
    // fclose(fpchar);
    // printf("File with character data created.\n");
    
    
    // fpchar = fopen("Character.txt", "r");
    // printf("\nReading Character.txt\n");
    // while((c = getc(fpchar)) != EOF)
    // {
    //     printf("%c", c);
    // }
    // fclose(fpchar);
    // printf("\n");

    fpint = fopen("Integer.txt", "w");
    // for(int i=1; i<=5; i++)
    // {
        scanf("%d", &in);
        putw(in, fpint);
    // }
    fclose(fpint);
    printf("File with integer data created.\n");

    printf("\nReading Integer.txt\n");
    fpint = fopen("Integer.txt", "r");
    // for(int i=1; i<=5; i++)
    // while((c = getw(fpint)) != EOF)
    // {
        in = getw(fpint);
        printf("%d", in);
    // }
    fclose(fpint);
    printf("\n");
}
