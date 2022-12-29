#include <iostream>
using namespace std;

template <typename T>
class number
{
    T _no;

public:
    number()
    {
        _no =0;
    }

    number(T no)
    {
        _no = no;
    }

    friend number<T> operator+(number<T> x, number<T> y);             //Member Function
    // number add(number x)

    void display()
    {
        cout << "no: " << _no << endl;
    }

    // friend number operator+(number x, number y);
};

// number operator+(number x, number y)         //Friend Function
// {
//     number t;
//     t._real = x._real + y._real;
//     return t;
// }

number<T> operator+(number<T> x, number<T> y)             //Member Function
    // number add(number x)
    {
        number<T> t;
        t._no = x._no + y._no;
        return t;
    }
    
int main()
{
    //number *c = new number(10.2F, 20.4F);        //Constructor called explicitly
    number<int> c1(10); //Constructor called implicitly
    number<float> c2(50.23F);
    number<float> c3;
    //c3 = c1.add(c2);
    c3 = c1 + c2;               //more meaningful
    c3.display();
    return 0;
}