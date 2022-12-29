#include <iostream>

using namespace std;

class node
{
    int info;
    node *next;

public:
    void getinfo(int info)
    {
        this->info = info;
    }

    void getnext(node *next)
    {
        this->next = next;
    }

    int putinfo()
    {
        return info;
    }

    node *putnext()
    {
        return next;
    }
};

class linkedlist
{
    node *head = NULL;

public:
    linkedlist()
    {
        head = NULL;
    }

    void menu();
    void printlist();
    void insert();
    void _delete();
};

void linkedlist ::menu()
{
    int ch;
    while (1)
    {
        cout << "MAIN MENU" << endl;
        cout << "1. Print List" << endl;
        cout << "2. Insert (end)" << endl;
        cout << "3. Delete (end)" << endl;
        cout << "Enter choice (0 to exit): [ ]\b\b";
        cin >> ch;
        switch (ch)

        {
        case 0:
            exit(0);
            break;
        case 1:
            printlist();
            break;
        case 2:
            insert();
            break;
        case 3:
            _delete();
            break;
        default:
            cout << endl
                 << "Invalid option" << endl
                 << endl;
        }
    }
}

void linkedlist ::printlist()
{
    if (head == NULL)
    {
        cout << endl
             << "List is empty, nothing to print." << endl
             << endl;
        return;
    }

    node *current = head;
    cout << endl
         << "List contains the following items:" << endl
         << endl;
    while (1)
    {
        cout << current->putinfo() << endl;
        if (current->putnext() == NULL)
            break;

        current = current->putnext();
    }
    cout << endl
         << "End of list." << endl
         << endl;
}

void linkedlist ::insert()
{
    int val;
    if (head == NULL)
    {
        head = new node();
        cout << "\nEnter value: ";
        cin >> val;
        head->getinfo(val);
        head->getnext(NULL);
        cout << endl
             << "Data inserted." << endl
             << endl;
    }
    else
    {
        node *current = head;
        while (current->putnext() != NULL)
        {
            current = current->putnext();
        }
        current->getnext(new node());
        current = current->putnext();
        cout << "\nEnter value: ";
        cin >> val;
        current->getinfo(val);
        current->getnext(NULL);
        cout << endl
             << "Data inserted" << endl
             << endl;
    }
}

void linkedlist ::_delete()
{
    if (head == NULL)
    {
        cout << endl
             << "List is empty, nothing to delete." << endl
             << endl;
        return;
    }

    if(head->putnext() == NULL)         //First Node
    {
        delete head->putnext();
        head = NULL;
        cout << endl << "Node deleted." << endl << endl;
        return;
    }

    node *current = head;

    while(1)
    {
        if(current->putnext()->putnext() == NULL)
            break;
        current = current->putnext();
    }

    delete current->putnext();
    current->getnext(NULL);

    cout << endl << "Node deleted." << endl << endl;
}

int main()
{
    linkedlist list;
    list.menu();
    return 0;
}