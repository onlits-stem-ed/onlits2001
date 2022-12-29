#include <iostream>
using namespace std;

class vector
{
    int *v;
    int size;
    int temp;

public:
    vector(int m)       //null vector
    {
        temp = 10;
        v = new int[size = m];
        for (int i = 0; i < size; i++)
        {
            v[i] = 0;
        }
        cout << "Constructor 1(size): " << size << endl;
    }
    vector(int *a)
    {
        // for (int i = 0; i < size; i++)
        // {
        //     v[i] = a[i];
        //     // cout << v[i] << "\t" << a[i] << endl;
        // }
        cout << "temp: " << temp << endl;
        cout << "Constructor 2(size): " << size << endl;
    }

    void copy(int *a)
    {
        for (int i = 0; i < size; i++)
        {
            v[i] = a[i];
            cout << v[i] << "\t" << a[i] << endl;
        }
        // cout << "temp: " << temp << endl;
        // cout << "Copy function (size): " << size << endl;
    }

    void display_vector()
    {
        cout << "------------------" << endl;
        for (int i = 0; i < size; i++)
        {
            cout << v[i] << endl;
        }
        cout << "------------------" << endl;
    }
    int operator*(vector &y) //scalar product
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += this->v[i] * y.v[i];
        }
        return sum;
    }
};

int main()
{
    int x[3] = {1, 2, 3};
    int y[3] = {4, 5, 6};
    vector v1(3);
    vector v2(3);
    v1.copy(x);
    v2.copy(y);
    v1.display_vector();
    v2.display_vector();
    int R = v1 * v2;
    cout << "R = " << R << endl;
    return 0;
}