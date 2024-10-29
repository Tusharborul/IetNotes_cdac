#include<iostream>
using namespace std;
class student
{
	protected:
		float sem1 = 9.00;
};
class performance:public student
{
	public:
	float sem2 = 9.56;
	void result()
	{
		cout<<"Total marks: "<<sem1+sem2<<endl;
	}
};
int main()
{
	performance p1;
	p1.result();
}
