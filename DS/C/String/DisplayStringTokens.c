#include <stdio.h>
int main()
{
    int i=0;
    char str[100];
    printf("Enter a string: ");
    scanf("%[^\n]", str);
    while (str[i] != '\0')
    {
        printf("%c", str[i]);
        if(str[i]==' ')
        {
            printf("\n");
        }
        i++;
    }
    printf("\n");
    return 0;
}