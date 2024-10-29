#include<iostream>
using namespace std;
class Books
{
  char name[10];
  public:
    void getdata();
    void putdata();
};
void Books::getdata()
{
  cin >> name;
}
void Books::putdata()
{
  cout << name<<endl;
}
int main()
{

	cout << "enter the name of books" << endl;
  Books arr[10];
  int i;
  for(i = 0; i < 10; i++)
    arr[i].getdata();
   
  cout << "name of books is " << endl;
   
  // Accessing the function
  for(i = 0; i < 10; i++)
   arr[i].putdata();
}

