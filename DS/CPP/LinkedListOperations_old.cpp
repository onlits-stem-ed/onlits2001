#include <iostream>
using namespace std;
namespace linked_list
{
    class node
    {
        int _data;  //4 bytes
        node *next; //8 bytes
        // Class storage!
        // int y;       
        // int x;
        // float z;
        // float _z;
        // int _hello;

    public:
        node();
        node(int data);
        int get_data();
        node *get_next();
    };

    node ::node()
    {
        next = NULL;
    }

    node ::node(int data)
    {
        _data = data;
        next = NULL;
    }

    int node ::get_data()
    {
        return _data;
    }

    node *node ::get_next()
    {
        return next;
    }

    class list
    {
        node *head;
        node *cn;

    public:
        list()
        {
            head = NULL;
        }
        void menu();
        void display();
        void insert_end();
        void delete_end();
    };

    void list ::menu()
    {
        int ch;
        do
        {
            cout << "MAIN MENU" << endl;
            cout << "1. Display (Traversal)" << endl;
            cout << "2. Insert (At the end)" << endl;
            cout << "Enter your choice (0 to exit): ";
            cin >> ch;
            switch (ch)
            {
            case 0:
                exit(0);
                break;
            case 1:
                display();
                break;
            case 2:
                insert_end();
                break;
            default:
                cout << endl
                     << "Invalid Input" << endl
                     << endl;
            }
        } while (1);
    }

    void list ::display()
    {
        if (head == NULL)
        {
            cout << endl
                 << "List is empty. There is nothing to display!" << endl
                 << endl;
        }
        else
        {
            cout << endl
                 << "The list contains following elements:" << endl;
            do
            {
                cout << head->get_data() << endl
                     << endl;
            } while (head->get_next() != NULL);
        }
    }

    void list ::insert_end()
    {
        head = new node(10);
    }

}
int main()
{
    using namespace linked_list;
    list l;
    node n;
    cout<<"Size of n = "<<sizeof(n)<<endl;
    cout<<"Size of l = "<<sizeof(l)<<endl;
    l.menu();
    return 0;
}