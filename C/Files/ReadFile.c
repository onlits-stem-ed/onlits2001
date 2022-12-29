#include <stdio.h>

int main(int argc, char *argv[])
{
    FILE *fp;
    char c;
    if(argc>1)
    {
    printf("%d\n", argc);
    if(fp = fopen(argv[1], "r") == NULL)
    {
        printf("File does not exist.\n");
        return;
    }

    printf("\n%p\n\n", fp);
    printf("The file contains:\n");
    while ((c = getc(fp)) != EOF)
    {
        putchar(c);
    }
    fclose(fp);
    }
    else
    {
        printf("No file name provided!\n");
    }
    return 0;
}

//TODO: Tell about return 1