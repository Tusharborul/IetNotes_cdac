#include <iostream>
using namespace std;
class account{
	protected:
		int sal=2000;
};
class bonas: public account{
	int bon;
	public:
		void monSal(int bon){
			this->bon=bon;
			cout<<sal+bon;
		}
	
};
int main(){
	bonas person;
	person.monSal(500);
}
