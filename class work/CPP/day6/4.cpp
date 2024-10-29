#include<iostream>
using namespace std;
class A
{
int a;
public:
A(int);
};
A::A(int p)
{
cout<<"in para of A\n";
cout<<p<<endl;
}
class B:public A
{
int b;
public:
B();
};
B::B() :A(10)
{
cout<<"in default of B";
}
int main()
{
B bobj;
}
