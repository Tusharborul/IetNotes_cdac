#include<iostream>
#include<string.h>
using namespace std;

class Account
{
	int acc_id;
	char name[10];
		
	static float rate_of_interest;
	public:
	Account(int acc_id, char* name)
	{
		this->acc_id = acc_id;
		strcpy(this->name, name);
	}
	void display()
	{
		cout<<acc_id<<"  "<<name<<"  "<<rate_of_interest<<endl;
	}
};
float Account::rate_of_interest=9.5;  
int main()
{
	Account a1(400, "Ajay");
	Account a2(800, "Sujay");
	a1.display();
	a2.display();

}

