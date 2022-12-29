#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int info;
    struct node *next;
} NODE;

void insert_last(NODE **first);
void print_list(NODE **first);
void delete_last(NODE **first);

int main()
{
    NODE *first = NULL;
    int ch;

    while (1)
    {
        printf("MAIN MENU\n");
        printf("1. Print List\n");
        printf("2. Insert (end)\n");
        printf("3. Delete (end)\n");
        printf("Enter choice (0 to exit): ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 0:
            exit(0);
            break;
        case 1:
            print_list(&first);
            break;
        case 2:
            insert_last(&first);
            break;
        case 3:
            delete_last(&first);
            break;
        default:
            printf("\nInvalid option.\n\n");
            break;
        }
    }
}

void insert_last(NODE **first)
{
    if (*first == NULL) // Inserting First Node
    {
        *first = malloc(sizeof(NODE));
        printf("\nEnter value: ");
        scanf("%d", &(*first)->info);
        (*first)->next = NULL;
        printf("\nData inserted.\n\n");
    }
    else // Code for subsequent nodes
    {
        NODE *current = *first;

        while (current->next != NULL)
        {
            current = current->next;
        }

        current->next = malloc(sizeof(NODE));
        printf("\nEnter value: ");
        scanf("%d", &current->next->info);
        current->next->next = NULL;
        printf("\nData inserted.\n\n");
    }
}

void delete_last(NODE **first)
{
    NODE *current = *first;
    if (current == NULL) // Check if any node is available or not
    {
        printf("\nList empty. Nothing to delete.\n\n");
        return;
    }

    if (current->next == NULL)      //If only one node is there
    {
        free(current);
        *first = current = NULL;
        printf("\nNode deleted.\n\n");
        return;
    }

    while (1)   //Subsequent nodes
    {
        if (current->next->next == NULL)
            break;

        current = current->next;
    }
    free(current->next);
    current->next = NULL;
    printf("\nNode deleted.\n\n");
}

void print_list(NODE **first)
{
    NODE *current = *first;
    if (current == NULL)
    {
        printf("\nList is empty. Nothing to print\n\n");
        return;
    }

    printf("\nPrinting list ...\n\n");
    do // Logic to traverse to the last node
    {
        printf("%d\n", current->info);
        current = current->next;
    } while (current != NULL);
    printf("\nEnd of list.\n\n");
}