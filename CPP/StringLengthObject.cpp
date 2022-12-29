#include <iostream>
using namespace std;
int main()
{
    string name;
    cout << "Enter your name: ";
    getline(cin, name);
    cout << "Your name has " << name.length() << " characters." << endl;
    return 0;
}