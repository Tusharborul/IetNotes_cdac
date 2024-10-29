#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter the size of array"<<endl;
	cin>>n;
	int arr[n];
	cout<<"enter the array element"<<endl;
	for(int i=0;i<n;i++){
	cin>>arr[i];
	}
	int sum=0;

	for(int i=0;i<n;i++){
		sum=sum+*(arr+i);
	}
	float avg=(float)sum/n;
	
	cout<<"average of all element in an arr is "<<avg;

	
};

