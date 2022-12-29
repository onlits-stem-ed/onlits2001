#include <stdio.h>
#include <string.h>
#include "CustomStringCompare.c"
void selection_sort();
void display(char strings[][30], int size);

int main()
{
    int size = 5;
    char strings[][30] = {"Ravi", "Mrityunjay", "Ashok", "Suresh", "Seema"};
    printf("Unsorted Array of String:\n");
    display(strings, size);
    selection_sort(strings, size);
    printf("\nSorted Array of Strings:\n");
    display(strings, size);
    return 0;
}

void display(char strings[][30], int size)
{
    for(int i=0; i<size; i++)
    {
        printf("%s\n", strings[i]);
    }
}

void selection_sort(char strings[][30], int size)
{
    char temp[30];

    for(int i=0; i<size-1; i++)
    {
        for(int j=i+1; j<size; j++)
        {
            if(compare(strings[i], strings[j])>0)
            {
                strcpy(temp, strings[i]);
                strcpy(strings[i], strings[j]);
                strcpy(strings[j], temp);
            }
        }
    }
}