#include <iostream>
using namespace std;
int main()
{
    char name[30];
    int i = 0;
    cout << "Enter your name: ";
    cin.getline(name, 30);
    while (name[i] != '\0')
    {
        i++;
    }
    cout << "Your name has " << i << " characters." << endl;
    return 0;
}