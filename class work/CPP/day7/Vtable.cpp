#include <iostream>

using namespace std;
class A{
	public:
 void call(){
			cout<<"in virtual of a"<<endl;
		};
		virtual void show()=0;	
};
class B: public A{
	public:
		void call(){
			cout<<"in B"<<endl;
			
		};
		void show(){
			cout<<"try"<<endl;
		}
};
int main(){
	A * ptr = new B();
	ptr->call();
	ptr->show();
}
