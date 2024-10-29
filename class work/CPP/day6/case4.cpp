#include<iostream>
using namespace std;
class employee
{
int id;
public:
employee();
employee(int);
virtual void display();
virtual int findsalary()
{
return 0;
}
};
employee::employee()
{
cout<<"in default of emp\n";
id=0;
}
employee::employee(int i)
{
cout<<"in para of emp\n";
id=i;
}
void employee::display()
{
cout<<"id of an emp is "<<id<<endl;
}
class wageemployee:public employee
{
int hrs,rate;
public:
wageemployee();
wageemployee(int,int,int);
void display();
int findsalary();
};
wageemployee::wageemployee()
{
cout<<"in default of wage\n";
hrs=0;
rate=0;
}
wageemployee::wageemployee(int i,int h,int r) :employee(i)
{
cout<<"in para of wage\n";
hrs=h;
rate=r;
}
int wageemployee::findsalary()
{
return hrs * rate;
}
void wageemployee::display()
{
employee::display();
cout<<hrs<<endl;
cout<<rate<<endl;
}
int main()
{
employee * ptr=new wageemployee (101,5,500);
cout<<"salary is "<<ptr->findsalary();//with virtual keyword binding takes
//at runtime and at run time type of object is checked rather than type
//of pointer.depending on type of object,function of that class will be
//executed
ptr->display();
}
