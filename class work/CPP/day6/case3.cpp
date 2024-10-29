#include<iostream>
using namespace std;
class A{
	int a;
	public:
		A(int);
		void display();
	
};
A::A(int p){
	cout<<"In para of A"<<endl;
	a=p;
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
B::B(int p, int q):A(p)
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
