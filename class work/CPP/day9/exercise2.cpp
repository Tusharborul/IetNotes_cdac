//Excercise 2:
#include <iostream>
using namespace std;

class Test
{
	static int x;
public:
	Test() { x++; }
	static int getX() {return x;}
};
int Test::x;
int main()
{
	//Test a;
//	Test b;
	cout << Test::getX() << " ";
}

