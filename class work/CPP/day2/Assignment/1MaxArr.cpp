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
	int max=arr[0];
//		for(int i=0;i<n;i++){
//	cout<<arr[i];
//	}
	for(int i=0;i<n-1;i++){
		if(max<arr[i+1]){
			max=arr[i+1];
		
		}
	}
	cout<<"Maximum element in an arr is "<<max;
	
	
	
	

	
};

