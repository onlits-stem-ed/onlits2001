#include <stdio.h>
#include <stdlib.h>

#define MAX 5

void printstack(int *stack, int *top, int *size);
void push(int *stack, int *top, int *size);
void pop(int *stack, int *top, int *size);

int main()
{
    int stack[MAX], top = -1, size = 0, ch;

    while (1)
    {
        printf("MAIN MENU\n");
        printf("1. Print Stack\n");
        printf("2. Push\n");
        printf("3. POP\n");
        printf("Enter choice (0 to exit): ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 0:
            exit(0);
            break;
        case 1:
            printstack(stack, &top, &size);
            break;
        case 2:
            push(stack, &top, &size);
            break;
        case 3:
            pop(stack, &top, &size);
            break;
        default:
            printf("\nInvalid option\n\n");
        }
    }
    return 0;
}

void printstack(int *stack, int *top, int *size)
{
    if (*top == -1) // Addressing underflow condition
    {
        printf("\nStack is empty, nothing to print\n\n");
        return;
    }

    printf("\nPrinting stack...\n\n");
    for (int i = *top; i < *size; i++)
    {
        printf("%d\n", stack[i]);
    }
    printf("\n...end of stack.\n\n");
}

void push(int *stack, int *top, int *size)  //O(n)
{
    if (*size == MAX) // Addressing overflow condition
    {
        printf("\nStackoverflow! Cannot push anymore\n\n");
        return;
    }

    if (*top == -1)
    {
        *top = 0;
    }
    else // Making space for the new item
    {
        for (int i = *size; i > 0; i--)
        {
            stack[i] = stack[i - 1];
        }
    }

    printf("\nEnter a value: ");
    scanf("%d", &stack[*top]);
    (*size)++;
    printf("\nElement pushed\n\n");
}

void pop(int *stack, int *top, int *size)
{
    if (*top == -1) // Addressing underflow condition
    {
        printf("\nStack is empty, nothing to pop\n\n");
        return;
    }

    if (*size == 1)
    {
        *top = -1;
    }
    else
    {
        for (int i = *top; i < *size - 1; i++)
        {
            stack[i] = stack[i + 1];
        }
    }

    (*size)--;
    printf("\nElement popped\n\n");
}