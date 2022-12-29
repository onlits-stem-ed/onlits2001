#include <iostream>
using namespace std;

int main()
{
    int a = 20, b = 40;
    int &r = a, &s = b;
    int *p = &a;

    cout << "Address of a is " << &a <<endl;
    cout << "Address of b is " << &b <<endl;
    cout << "Address of r is " << &r <<endl;
    cout << "Address of s is " << &s <<endl;
    cout << "Address of p is " << &p <<endl;

    cout << "Sum of r & s is " << r + s;

    return 0;
}