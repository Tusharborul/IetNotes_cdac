#include<iostream>
using namespace std;
class A{
	int a;
	public:
		A();
		void display();
	
};
A::A(){
	cout<<"In default of A"<<endl;
	a=0;
}
void A::display()
{
	cout<<a<<endl;
}
class B : public A
{
	int b;
	public:
		B(int, int);
		void display();
};
B::B(int p, int q)
{
	cout<<"In para of B"<<endl;
	b = q;
}
void B::display()
{
	A::display();
	cout<<b<<endl;
}
int main()
{
	B obj(50, 80);
	obj.display();
}
