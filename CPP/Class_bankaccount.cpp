<<<<<<< HEAD
#include<iostream>

using namespace std;

class Bank_Account
{
private:
    char Name[30];
    int AccountNum[11];
    char TypeAccount[15];
    float BalanceAmnt=00.00;
public:
    void User_Information()
    {
        cout<<"Please Enter Depositor Name: ";
        cin>>Name[30];
        cout<<"Depositor Account Number: ";
        cin>>AccountNum[11];
        cout<<"Depositor Account Type: ";
        cin>>TypeAccount[15];
        cout<<"Depositor Balance Ammount: ";
        cin>>BalanceAmnt;

    }
    void Deposit()
    {
        float ammount=0;

        cout<<"Enter Deposit Ammount: ";
        cin>>ammount;
        BalanceAmnt = BalanceAmnt+ammount;
        //cout<<"Deposit Ammount: "<<BalanceAmnt;


    }
    void Withdraw()
    {
        float release;

        cout<<"Depositor Ammount Balance: ";
        cin>>BalanceAmnt;
        cout<<"Enter Withdrawal Ammount: ";
        cin>>release;
        BalanceAmnt = BalanceAmnt - release;

    }
    void DisplayDep()
    {
        cout<<"Deposit Ammount: "<<BalanceAmnt;

    }
    void Display()
    {
        cout<<"Depositor Name: "<<Name[30];
        cout<<"Depositor Current Balance: "<<BalanceAmnt;


    }
};
int main()
{
    Bank_Account b;
    b.User_Information();
    b.Deposit();
    b.DisplayDep();
    b.Withdraw();
    b.Display();

    //return 0;

}














=======
#include<iostream>

using namespace std;

class Bank_Account
{
private:
    char Name[30];
    int AccountNum[11];
    char TypeAccount[15];
    float BalanceAmnt=00.00;
public:
    void User_Information()
    {
        cout<<"Please Enter Depositor Name: ";
        cin>>Name[30];
        cout<<"Depositor Account Number: ";
        cin>>AccountNum[11];
        cout<<"Depositor Account Type: ";
        cin>>TypeAccount[15];
        cout<<"Depositor Balance Ammount: ";
        cin>>BalanceAmnt;

    }
    void Deposit()
    {
        float ammount=0;

        cout<<"Enter Deposit Ammount: ";
        cin>>ammount;
        BalanceAmnt = BalanceAmnt+ammount;
        //cout<<"Deposit Ammount: "<<BalanceAmnt;


    }
    void Withdraw()
    {
        float release;

        cout<<"Depositor Ammount Balance: ";
        cin>>BalanceAmnt;
        cout<<"Enter Withdrawal Ammount: ";
        cin>>release;
        BalanceAmnt = BalanceAmnt - release;

    }
    void DisplayDep()
    {
        cout<<"Deposit Ammount: "<<BalanceAmnt;

    }
    void Display()
    {
        cout<<"Depositor Name: "<<Name[30];
        cout<<"Depositor Current Balance: "<<BalanceAmnt;


    }
};
int main()
{
    Bank_Account b;
    b.User_Information();
    b.Deposit();
    b.DisplayDep();
    b.Withdraw();
    b.Display();

    //return 0;

}














>>>>>>> a8223819cb6bfb5d6ae4a479581df51dcea3df00
