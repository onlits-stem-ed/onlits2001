#include <stdio.h>
#include <stdlib.h>

struct node
{
    int info;
    struct node *next;
};

typedef struct node NODE;

void printstack(NODE **top);
void push(NODE **top);
void pop(NODE **top);

int main()
{
    NODE *top = NULL;
    int ch;

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
            printstack(&top);
            break;
        case 2:
            push(&top);
            break;
        case 3:
            pop(&top);
            break;
        default:
            printf("\nInvalid option\n\n");
        }
    }
    return 0;
}

void printstack(NODE **top)
{
    if (*top == NULL) // Addressing underflow condition
    {
        printf("\nStack is empty, nothing to print\n\n");
        return;
    }

    NODE *current = *top;
    printf("\nPrinting stack...\n\n");
    while (current != NULL)
    {
        printf("%d\n", current->info);
        current = current->next;
    }
    printf("\n...end of stack.\n\n");
}

void push(NODE **top) // O(1)
{
    //     if (*size == MAX) // Addressing overflow condition
    //     {
    //         printf("\nStackoverflow! Cannot push anymore\n\n");
    //         return;
    //     }
    if (*top == NULL)   //for the first node
    {
        *top = malloc(sizeof(NODE));
        (*top)->next = NULL;
    }
    else // Making space for the new item
    {
        NODE *temp = *top;
        *top = malloc(sizeof(NODE));
        (*top)->next = temp;
        printf("\n%p\n\n", (*top)->next);
        temp = NULL;
    }

    printf("\nEnter a value: ");
    scanf("%d", &(*top)->info);
    printf("\nElement pushed\n\n");
}

void pop(NODE **top)
{
        if (*top == NULL) // Addressing underflow condition
        {
            printf("\nStack is empty, nothing to pop\n\n");
            return;
        }

        if ((*top)->next == NULL)   //For last element in stack
        {
            free(*top);
            *top = NULL;
        }
        else    //other elements
        {
            NODE *temp = *top;
            *top = (*top)->next;
            free(temp);
            temp = NULL;
        }

        printf("\nElement popped\n\n");
}