#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE;

void menu();
void display();
void insert_end();
void delete_end();

//NODE *head;


int main()
{
    NODE *head = NULL;
    //head = (NODE*)malloc(sizeof(NODE));
    menu(head);
}

void menu(NODE *head)
{
    int ch;
    printf("MAIN MENU\n");
    printf("1. Display (Traversal)\n");
    printf("Enter your choice (0 to exit): ");
    scanf("%d", &ch);
    switch(ch)
    {
        case 0:
            exit(0);
            break;
        case 1:
            display(head);
            break;
        default:
            printf("\nInvalid Input!\n\n");
    }
}

void display(NODE *head)
{
    if(head == NULL)
    {
        printf("\nList is empty. There is nothing to display!\n\n");
    }
    else
    {
        printf("\nThe list contains following elements:\n");
        do
        {
            printf("%d\n", head->data);
        }
        while(head->next != NULL);
    }
}