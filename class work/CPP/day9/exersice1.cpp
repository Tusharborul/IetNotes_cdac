//Excercise 1:
#include<iostream>
using namespace std;
class complex
{
	int real,img;
	public:static const int cnt;
	private:static const int cnt1;
	public:
		complex()
		{
			cout<<"default is invoked\n"<<endl;
			real=5;
			img=5;
		//	cnt++;//not allowed
		}
		static int getcnt()
		{
			return cnt1;
		}
};
const int complex::cnt=5;//memory alloaction takes place
const int complex::cnt1=10;
int main()
{
	complex c1;
	cout<<"no of obj created is: "<<complex::getcnt()<<endl;
	cout<<"sizeoof obj is: "<<sizeof(c1)<<endl;
	cout<<complex::cnt;
	//cout<<complex::cnt1;

}
