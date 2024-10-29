// C++ program to demonstrate protected access modifier
#include <iostream>
using namespace std;
 class Parent
{   
    protected:
    int id;
  };
class Child : public Parent
{
    public:
    void setId(int id)
    { 
             this->id = id;
      }
       void displayId()
    {
        cout << "id is: " << id << endl;
    }
};
 int main() {
     
    Child obj1;
//	obj1.id;--------->error because id is procted
 	obj1.setId(40);
    obj1.displayId();
    
}
