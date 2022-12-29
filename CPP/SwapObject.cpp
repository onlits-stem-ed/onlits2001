#include <iostream>
using namespace std;
class Pair
{
    int _a;
    int _b;

public:
    Pair(int a, int b);
    friend Pair swap(Pair p);
    int get_a()
    {
        return _a;
    }

    int get_b()
    {
        return _b;
    }
};

Pair::Pair(int a, int b)
{
    _a = a;
    _b = b;
}

Pair swap(Pair p)
{
    int t = p._a;
    p._a = p._b;
    p._b = t;
    return p;
}

int main()
{
    int a = 10;
    int b = 20;
    Pair p = Pair(a, b);
    cout << "Values of a and b before swapping are " << a << " and " << b << " respectively!" << endl;
    p = swap(p);
    a = p.get_a();
    b = p.get_b();
    cout << "Values of a and b after swapping are " << a << " and " << b << " respectively!" << endl;
    return 0;
}