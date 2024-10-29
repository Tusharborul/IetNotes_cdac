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
	a=10;
}
void A::display()
{
	cout<<a<<endl;
}
class B : public A
{
	int b;
	public:
		B();
		void display();
};
B::B()
{
	cout<<"In deafult of B"<<endl;
	b = 20;
}
void B::display()
{
	cout<<b<<endl;
}
int main()
{
	B obj;
	obj.display();
}
