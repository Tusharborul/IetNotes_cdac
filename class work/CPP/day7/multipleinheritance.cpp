#include<iostream>
using namespace std;

class parent1{
	public:
		parent1(){
			cout<<"in def of parent1"<<endl;
		}
		
};
class parent2{
	public:
		parent2(){
			cout<<"in def of parent2"<<endl;
		}
};
class child:public parent2,public parent1{
	public:
		child(){
				cout<<"in def of child"<<endl;
		}
		
};
int main(){
	child obj;
	
}
