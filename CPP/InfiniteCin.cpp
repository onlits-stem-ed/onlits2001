#include<iostream>
using namespace std;
int main()
{
    int n;
    while(cin>>n)
    {
        cout<<n<<endl;;
    }
    cout<<"Received EOF character"<<endl;
    cout<<"press enter to continue!"<<endl;
    cin>>n;
    return 0;
}