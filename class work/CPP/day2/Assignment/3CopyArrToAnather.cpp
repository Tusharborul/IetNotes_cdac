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

	int arr2[n];
	for(int i=0;i<n;i++){
		arr2[i]=*(arr+i);
	}
	cout<<"printing another Array"<<endl;
	for(int i=0;i<n;i++){
	cout<<arr2[i]<<endl;
	}

	
};

