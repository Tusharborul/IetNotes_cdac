#include <iostream>
using namespace std;

class Vehical{
	int a=10;
	protected :
		int b=20;
	
	public:
		int c=30;
};
class bike: protected Vehical{

	public:
		void callB(){
			cout<<b;	
		}
		void callC(){
			cout<<c;
		}
};

int main(){
	bike b1;
//	cout<<b1.a<<endl;---->error private not inherite
//	cout<<b1.b<<endl;---->error protected not access access out side of class
//	cout<<b1.c<<endl;---->error protected data cannot access out side of class
//	b1.callA();---------->error private not inherite
	b1.callB();
	b1.callC();
}
