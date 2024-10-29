#include<iostream>
using namespace std;
int main(){
	int num[5];
	cout<<"enter numbers: ";
	for(int i=0;i<5;i++){
		cin>>num[i];
	}
	cout<<"the numbers are: ";
	for(int i=0;i<5;i++){
		cout<<num[i];
	}
}
