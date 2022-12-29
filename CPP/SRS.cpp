#include<iostream>

using namespace std;

class SRS
{
	string title;
	float version;
	string purpose;
	string convention;
	string references;	

public:
	SRS(string t)
	{
		title = t;
	}
	SRS(string t, float v)
	{
		title = t;
		version = v;
	}
	
	void getTitle(string t)
	{
		title = t;
	}
	void getVersion(float v)
	{
		version = v;
	}
	void getPurpose(string p)
	{
		purpose = p;
	}
	void getConvention(string c)
	{
		convention = c;
	}
	void getReferences(string r)
	{
		references = r;
	}
	
	void show()
	{
		cout<<"Title: "<<title<<endl;
		cout<<"Version: "<<version<<endl;
		cout<<"Purpose: "<<purpose<<endl;
		cout<<"Document Convention: "<<convention<<endl;
		cout<<"References: "<<references<<endl;
	}
};
