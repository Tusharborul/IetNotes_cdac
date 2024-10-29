//#include<iostream>
using namespace std;

struct student{
	int rollNo;
	char grade;
	char name[10];
	
};
class employee{
	int id;
	char name[10];
	public:
		void setName();
		void getName();
		
};
void employee::setName(){
	cin>>name;
};
void employee::getName(){
	cout<<name;
};

int main(){
	student s1={1,'A',"tushar"};
	cout<<s1.name<<endl;
	employee s2;
	cout<<"enter employee name "<<endl;
	
	s2.setName();
	s2.getName();

};

