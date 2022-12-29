#include <iostream>

using namespace std;

namespace diamond       //Abstract Class
{
    class D
    {
    public:
        virtual void fun() = 0; //pure virtual function
    };

    class A : public D
    {
    public:
        // void fun()
        // {
        //     cout << "Modified in class A" << endl;
        // }
    };

    class B : public D
    {
    public:
        void fun()
        {
            cout << "Modified in class B" << endl;
        }
    };

    class C : public A, public B
    {
    public:
        // void fun()
        // {
        //     cout << "Modified in class c." << endl;
        // }
    };
}

using namespace diamond;

int main()
{
    C c;
    c.B::fun();
}