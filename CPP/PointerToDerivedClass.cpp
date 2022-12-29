#include <iostream>
using namespace std;

class WeatherData
{
public:
    virtual void setdata() = 0;         //Pure virtual function
    virtual void getdata()              //virtual function
    {

    }
};

class jsondata : public WeatherData
{
public:
    void setdata()
    {
        cout << "JSON" << endl;
    }
};

class xmldata : public WeatherData
{
public:
    void setdata()
    {
        cout << "XML" << endl;
    }
};

class factory
{
public:
    static WeatherData* create_json_object(int i)
    {
        if(i==1)
            return new jsondata();
        else
            return new xmldata();
    }
};

int main()
{
    int i;
    // jsondata ob;                        //named location
    WeatherData *j = new jsondata();       //unnamed location
    cout<<"Enter a number: ";
    cin>>i;
    WeatherData *ob = factory::create_json_object(i);
    ob->setdata();
    return 0;
}