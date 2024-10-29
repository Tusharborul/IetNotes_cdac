#include<iostream>
using namespace std;
class demo{
	private:
		int x;
	protected:
		int y;
	public:
		demo()
		{
			x = 80;
			y = 90;
		}
	friend void func(demo&);
};
void func(demo& obj)
{
	cout<<"Value of pri X = "<<obj.x<<endl;
	cout<<"Value of pro Y = "<<obj.y<<endl;
	
}
int main()
{
	demo obj;
	func(obj);
}
