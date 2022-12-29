#include <stdio.h>
int main()
{
    char name[30], i=0;
    char age;
    printf("Enter your name: ");
    scanf("%[^\n]%*c", name);
    // getchar();
    // fflush(stdin);
    printf("Enter a character: ");
    scanf("%c", &age);
    while(name[i] != '\0')
    {
        printf("%c", name[i]);
        i++;
    }
    printf("\n");
    return 0;
}