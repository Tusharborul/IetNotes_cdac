// C++ program to demonstrate implementation of Inheritance
 #include <iostream>
using namespace std;
class Parent {
public:
    int id_p;
};
class Child : public Parent {
public:
    int id_c;
    void display()
    {
    	cout<<id_p;//allowed
	}
};
 int main()
{
    Child obj1;
  
    obj1.id_c = 7;
    obj1.id_p = 91;
    cout << "Child id is: " << obj1.id_c << '\n';
    cout << "Parent id is: " << obj1.id_p << '\n';
    cout<<sizeof(obj1);
}
