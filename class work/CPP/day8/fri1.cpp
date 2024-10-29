#include<iostream>
using namespace std;
class demo
{
	private:
		int a;
		
	protected:
		int b;
	
	public:
		demo()
		{
			a=10;
			b=20;
		}
		friend class xyz;
};
 class xyz
{
	public:
		void display(demo& d)
		{
			cout<<"pri a= "<<d.a<<endl;
			cout<<"pro b= "<<d.b<<endl;
		}
};

int main()
{
	demo d;
	xyz d1;
	d1.display(d);
}
