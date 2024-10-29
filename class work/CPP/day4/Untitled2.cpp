#include<iostream>
using namespace std;
class obj{

	public:
		int *ptr;
	void set(int n){
		*ptr=n;
	}
	obj(){
		ptr=new int;
		cin>>*ptr;
	}		
	
};
int main(){
	obj obj1;

	cout<<obj1.ptr;
	
	
	
}
