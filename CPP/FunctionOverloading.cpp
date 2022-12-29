#include <iostream>
using namespace std;

void sum(int, int);
void sum(float, float);

int main()
{
    sum(10, 20);
    sum(30.0F, 40.0F);
    return 0;
}

void sum(int a, int b)
{
    cout<<"The sum of integers "<<a<<" and "<<b<<" is "<<a + b<<endl;
}

void sum(float a, float b)
{
    cout<<"The sum of floats "<<a<<" and "<<b<<" is "<<a + b<<endl;
}