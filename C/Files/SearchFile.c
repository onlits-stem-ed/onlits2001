#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    char str[100], sub[50], *temp;
    int i;
    FILE *fp;
    if (argc > 1)
    {
        fp = fopen(argv[1], "r");
        if (fp == NULL)
        {
            printf("File not found\n");
            exit(1);
        }
        while ((str[i] = getc(fp)) != EOF)
        {
            i++;
        }
        fclose(fp);

        printf("Enter the sub-string to search: ");
        scanf("%s", sub);

        printf("Till here aal is well\n");
        temp = strstr(str, sub);

        int sublen = strlen(sub);
        for (int i = 0; i < sublen; i++)
        {
            putchar(temp[i]);
        }
        putchar('\n');
        if (temp == NULL)
            printf("Substring not found\n");
        else
        {
            int index = temp - str;
            printf("%s found at %d.\n", sub, index);
        }
    }
    else
    {
        printf("Please provide a filename.\n");
        exit(50);
    }
    return 0;
}