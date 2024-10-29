#include <iostream>
using namespace std;
class Student{
	int a=10;
	public:
		int b=20;
	protected:
		int c=40;
		void callA(){
			cout<<a<<endl;
		}
		void callC(){
			cout<<c<<endl;
		}

};
class Boy:public Student{
	public:
		void callA1(){
			callA();
		}
		void callC1(){
			callC();
		}
};
int main(){
	
	Boy b1;
	b1.callA1();
	b1.callC1();
	cout<<sizeof(b1)<<endl;
}
