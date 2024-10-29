#include<iostream> 
using namespace std; 
#include<string.h>
class Demo
{
	int rollno;
	int marks[5];
	public: 
	void get()
	{
		cout<<"enter rollno\n";
		cin>>rollno;
		cout<<"enter marks\n";
		for(int i=0;i<=4;i++)
		{
			cin>>marks[i];
		}
	}
	
	void show()
	{
		cout<<" rollno"<<rollno;
		
		cout<<"marks\n";
		for(int i=0;i<=4;i++)
		{
			cout<<marks[i];
		}
	}
};
int main()
{
	int n;
	Demo d1[4];
for(int i=0;i<4;i++){

	d1[i].get();
	d1[i].show();
}
}
