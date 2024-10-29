#include<iostream>
using namespace std;
class emp{
	public:
		int sal;
		int id;
		char name[10];
		

		emp()
		{
			cout<<"In default of emp"<<endl;
		}
		
		
		
};
class w_emp : public emp
{
	public:
		int a;
		w_emp()
		{
			cout<<"In default of w_emp"<<endl;
		}
};
class x_emp : public emp
{
	public:
		int b;
		x_emp()
		{
			cout<<"In default of x_emp"<<endl;
		}
};
class all_emp : public x_emp ,public w_emp
{
	public:
	all_emp()
		{
			cout<<"In default of all_emp"<<endl;
		}
};
int main()
{
	all_emp obj;
	
}
