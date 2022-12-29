<<<<<<< HEAD
#include<iostream>
#include<cstdio>
#include<cstring>

using namespace std;

class bank_Account
{
private:
    char Name[30];
    //string name;
    int AccountNum;
    char TypeAccount[15];
    float balance;
    
    public:
    	
    bank_Account()
    {
		strcpy(Name,"Suman Kumar");
		AccountNum=12;
		strcpy(TypeAccount,"SA");
		balance=6000.0F;        
    }


    void init()
    {
		strcpy(Name,"Aman Kumar");
		AccountNum=12;
		strcpy(TypeAccount,"SA");
		balance=5000.0F;        
    }
    
    
    void Deposit()
    {
        float ammount=0;
		cout<<"Testing deposit module:"<<endl;
        cout<<"Enter Deposit Ammount: ";
        cin>>ammount;
        balance = balance+ammount;
        cout<<"Balance Ammount: "<<balance<<endl;


    }
    void Withdraw()
    {
        float release;
		cout<<"Testing withdraw module:"<<endl;
        //cout<<"Depositor Ammount Balance: "<<balance;
        //cin>balance;
        cout<<"Enter Withdrawal Ammount: ";
        cin>>release;
        balance = balance - release;
        cout<<"Balance Ammount: "<<balance<<endl;

    }
    //void DisplayDep(){cout<<"Deposit Ammount: "<<BalanceAmnt;}
    void Display()
    {
    	cout<<"Displaying Balance:"<<endl;
        cout<<"Depositor Name: "<<Name<<endl;
        cout<<"Depositor Current Balance: "<<balance<<endl;
    }
};

int main()
{
    bank_Account b;
    //b.init();
    b.Deposit();
    //b.DisplayDep();
    b.Withdraw();
    b.Display();

  //  return 0;

}
=======
#include<iostream>
#include<cstdio>
#include<cstring>

using namespace std;

class bank_Account
{
private:
    char Name[30];
    //string name;
    int AccountNum;
    char TypeAccount[15];
    float balance;
    
    public:
    	
    bank_Account()
    {
		strcpy(Name,"Suman Kumar");
		AccountNum=12;
		strcpy(TypeAccount,"SA");
		balance=6000.0F;        
    }


    void init()
    {
		strcpy(Name,"Aman Kumar");
		AccountNum=12;
		strcpy(TypeAccount,"SA");
		balance=5000.0F;        
    }
    
    
    void Deposit()
    {
        float ammount=0;
		cout<<"Testing deposit module:"<<endl;
        cout<<"Enter Deposit Ammount: ";
        cin>>ammount;
        balance = balance+ammount;
        cout<<"Balance Ammount: "<<balance<<endl;


    }
    void Withdraw()
    {
        float release;
		cout<<"Testing withdraw module:"<<endl;
        //cout<<"Depositor Ammount Balance: "<<balance;
        //cin>balance;
        cout<<"Enter Withdrawal Ammount: ";
        cin>>release;
        balance = balance - release;
        cout<<"Balance Ammount: "<<balance<<endl;

    }
    //void DisplayDep(){cout<<"Deposit Ammount: "<<BalanceAmnt;}
    void Display()
    {
    	cout<<"Displaying Balance:"<<endl;
        cout<<"Depositor Name: "<<Name<<endl;
        cout<<"Depositor Current Balance: "<<balance<<endl;
    }
};

int main()
{
    bank_Account b;
    //b.init();
    b.Deposit();
    //b.DisplayDep();
    b.Withdraw();
    b.Display();

  //  return 0;

}
>>>>>>> a8223819cb6bfb5d6ae4a479581df51dcea3df00
