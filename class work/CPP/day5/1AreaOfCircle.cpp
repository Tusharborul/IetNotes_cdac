#include<iostream>
using namespace std;

class Circle{
		float area;
	
		
		public:
			void areaOfCircle(float r){	
				area = 3.14f* r*r;
				cout<<area;
			}
};
int main(){
	Circle c1;
	float r=2.6;
	c1.areaOfCircle(r);
	
}





