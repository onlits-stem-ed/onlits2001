#include <stdio.h>

#define MAX 10
void display(int *arr, int size);

int main()
{
    int arr[MAX], size = 0, value, index;
    char ch;
    display(arr, size);
    while (1)
    {
        printf("Enter the value to insert: ");
        scanf("%d", &value);
        printf("Enter the index: ");
        scanf("%d%*c", &index);
        // --- The validation goes here
        
        if(index == size)       //O(1)
        {
            arr[index] = value;
            printf("Last insert!\n");
        }
        else                //O(n)
        {
            for(int i=size; i>index; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[index] = value;
            printf("Middle insert!\n");
        }
        size++;
        display(arr, size);
        printf("Would you like to insert another (y/n): ");
        scanf("%c", &ch);
        if (ch == 'n')
        {
            break;
        }
    }
}

void display(int *arr, const int size)
{
    int i;
    if (size == 0)
    {
        printf("The array is empty now!\n");
    }
    else
    {
        for (i = 0; i < size; i++)
        {
            printf("%d\n", arr[i]);
        }
    }
}