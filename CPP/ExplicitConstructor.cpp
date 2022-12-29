#include <iostream>
using namespace std;

class vector
{
    int *v;
    int size;
public:
    vector()
    {
        cout << "Object created!" <<endl;
    }

    ~vector()
    {
        cout << "Object destroyed!" <<endl;
    }
};

int main()
{
    vector();
    vector v, v2;
    v.~vector();
    cout << "This is a pause..." << endl;
    return 0;
}