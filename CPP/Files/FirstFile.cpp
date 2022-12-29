#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream fout("Fruits.123");
    fout << "Apple, Guava, Grapes, Pomegranate, Strawberry";
    // fout.write("Hello", 10);
    cout << "File created and information saved!" << endl;
    fout.close();
    getchar();
    cout << "The contents of the created files are:" << endl;
    ifstream fin;
    fin.open("Fruits.123");
    char str[100];
    fin.read(str, 100);
    cout << str << endl;
    return 0;
}