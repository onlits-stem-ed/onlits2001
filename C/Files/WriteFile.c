#include <stdio.h>

int main()
{
    FILE *fp;
    char c;
    fp = fopen("FirstFile.txt", "w");
    printf("Write something below:\n");
    while ((c = getchar()) != EOF)
    {
        putc(c, fp);
    }
    printf("File saved!\n");
    fclose(fp);
    return 0;
}