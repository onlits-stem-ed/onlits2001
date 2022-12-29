// WAP to accept names of 5 of your friends and display them

#include <stdio.h>
int main()
{
    char names[5][30];

    printf("The size of names array is %ld bytes.\n", sizeof(names));
    printf("Enter the names of any 5 of your friends:\n");
    for (int i = 0; i < 5; i++)
    {
        scanf("%[^\n]%*c", names[i]);
    }

    printf("The names of your friends are:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%s\n", names[i]);
    }
    return 0;
}

// Details and abstraction