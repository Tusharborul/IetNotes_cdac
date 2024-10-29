/*
//Excercise 1:
#include <iostream>
using namespace std;
 class Point {
 	public:
    Point() 
	{
	 cout << "Constructor called";
    }
};
int main()
{
    Point t1;
    return 0;
}
*/

/*
//Excercise 3:
#include<iostream> 

using namespace std; 
#include<stdlib.h> 
 class Test 
{ 
public: 
   Test() 
   { cout << "Constructor called"; } 
}; 
 int main() 
{ 
    Test *t = (Test *) malloc(sizeof(Test)); 
    return 0; 
} 

*/

/*
//Excercise 4:

#include<iostream>
using namespace std;
class temp
{
	int z;
	static int y;
public:
	temp();
	void show();
	void display();
};
int x;
int temp::y;
void temp::show()
{
	y++;
}
temp::temp()
{
	int z=200;
	x=100;
	cout<<"value of z is "<<z<<endl;
}
void temp::display()
{
	cout<<"value of x is "<<x<<endl;
	cout<<"value of y is  "<<y<<endl;
}
int main()
{
	temp t;
	t.show();
	t.show();
	t.display();
	cout<<sizeof(t);
}
*/
/*
//Excercise 5:

#include<iostream>
using namespace std;
class item
{
public:
	static int x;
	int number;
public:
	void getdata(int a)
	{
		number=a;
		number++;
		x++;
	}
	void getcount()
	{
		x=10;
		cout<<"value is "<<x<<endl;
	}
	void getcount_1()
	{
		x++;
		cout<<"value is  "<<number<<endl;
		cout<<"value is "<<x<<endl;
	}
};
int number=9;
int item::x;
int main()
{
	item a;
	a.getcount();
	a.getdata(100);
	a.getcount_1();
	cout<<number<<endl;
	cout<<a.number;
}
*/
#include<iostream>
using namespace std;
class Point {
public:
    Point() { cout << "Constructor called"; }
};
int main()
{
   Point  *t2;
   return 0;
}

