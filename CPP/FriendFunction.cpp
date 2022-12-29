#include <iostream>
using namespace std;

// namespace friend_class
// {
    class friend_test
    {
        int f;

    public:
        friend_test();
        void display_f();
        friend void fun_friend();   //permission
    };

    friend_test::friend_test()
    {
        f = 10;
    }
    void friend_test::display_f()
    {
        cout << "f=" << f << endl;
    }
// }

void fun_friend()
{
    // friend_class::friend_test ft;
    friend_test ft;
    ft.f = 20;
    ft.display_f();
}

int main()
{
    fun_friend();
}