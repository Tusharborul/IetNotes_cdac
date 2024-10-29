#include<iostream>
using namespace std;
int main(){
	int n,m;
	cout<<"enter the row and coloum of metrix "<<endl;
	cin>>n>>m;
	
	int arr1[n][m];
	cout<<"enter the array element of metrix"<<endl;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
		cin>>arr1[i][j];
		}
	}
	int arr2[m][n];
	cout<<"square of all elements of 2D array"<<endl;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			arr2[i][j]=	arr1[i][j]*arr1[i][j];
		cout<<arr2[i][j]<<" ";
		}
		cout<<endl;
	}
	
};

