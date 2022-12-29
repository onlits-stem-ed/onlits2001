#include <iostream>
using namespace std;

class complex
{
    float _real;
    float _imag;

public:
    complex()
    {
        _real = 0.0F;
        _imag = 0.0F;
    }

    complex(float real, float imag)
    {
        _real = real;
        _imag = imag;
    }

    // complex operator+(complex x)             //Member Function
    complex add(complex x)
    {
        complex t;
        t._real = _real + x._real;
        t._imag = _imag + x._imag;
        return t;
    }

    void display()
    {
        cout << "real: " << _real << ", imag: " << _imag << endl;
    }

    friend complex operator+(complex x, complex y);
};

complex operator+(complex x, complex y)         //Friend Function
{
    complex t;
    t._real = x._real + y._real;
    t._imag = x._imag + y._imag;
    return t;
}

int main()
{
    //complex *c = new complex(10.2F, 20.4F);        //Constructor called explicitly
    complex c1(10.2F, 20.4F); //Constructor called implicitly
    complex c2(50.23F, 100.96F);
    complex c3;
    //c3 = c1.add(c2);
    c3 = c1 + c2;               //more meaningful
    c3.display();
    return 0;
}