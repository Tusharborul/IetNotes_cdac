#include<iostream>

class Test
{
     int x;
public:
	Test() {
	    x=10; 
		}
	static int getX() 
	{
	    return x;
	}
	 
};
int Test::x;
int main()
{
	std::cout << Test::getX() << " ";
}

